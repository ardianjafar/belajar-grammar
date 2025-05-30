package com.manyan.belajargrammar.navigation

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.manyan.belajargrammar.data.local.database.AppDatabase
import com.manyan.belajargrammar.data.repository.ConversationRepository
import com.manyan.belajargrammar.data.repository.GrammarRepository
import com.manyan.belajargrammar.data.repository.TenseRepository
import com.manyan.belajargrammar.openPlayStore
import com.manyan.belajargrammar.ui.screen.*
import com.manyan.belajargrammar.ui.screen.about.AboutScreen
import com.manyan.belajargrammar.ui.screen.conversation.ConversationScreen
import com.manyan.belajargrammar.ui.screen.grammar.GrammarDetailScreen
import com.manyan.belajargrammar.ui.screen.grammar.GrammarScreen
import com.manyan.belajargrammar.ui.screen.mistake.MistakeDetailScreen
import com.manyan.belajargrammar.ui.screen.mistake.MistakeItemsScreen
import com.manyan.belajargrammar.ui.screen.mistake.MistakeListScreen
import com.manyan.belajargrammar.ui.screen.quiz.CertificateQuizScreen
import com.manyan.belajargrammar.ui.screen.tenses.TenseDetailScreen
import com.manyan.belajargrammar.ui.screen.tenses.TensesScreen
import com.manyan.belajargrammar.ui.viewModel.MistakeProgressViewModel
import com.manyan.belajargrammar.ui.viewmodel.FavoriteGrammarViewModel
import com.manyan.belajargrammar.ui.viewmodel.FavoriteTenseViewModel
// import com.manyan.belajargrammar.ui.viewmodel.MistakeProgressViewModel
import kotlinx.coroutines.launch


@Composable
fun AppNavGraph(
    navController: NavHostController,
    database: AppDatabase,
    favoriteGrammarViewModel: FavoriteGrammarViewModel,
    favoriteTenseViewModel: FavoriteTenseViewModel,
    onToggledTheme: (Boolean) -> Unit,
    isDarkTheme: Boolean,
    drawerState: DrawerState,
    mistakeProgressViewModel: MistakeProgressViewModel,

    ) {
    NavHost(navController = navController, startDestination = Routes.WELCOME) {
        composable(Routes.WELCOME) {
            WelcomeScreen(navController)
        }

        composable(Routes.ABOUT) {
            AboutScreen(onBackClick = { navController.popBackStack() })
        }

        composable(Routes.MAIN) {
            val scope = rememberCoroutineScope()
            val context = LocalContext.current
            var showRateDialog by remember { mutableStateOf(false) }

            ModalNavigationDrawer(
                drawerState = drawerState,
                drawerContent = {
                    if (drawerState.isOpen) {
                        Box(
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(LocalConfiguration.current.screenWidthDp.dp * 0.7f)
                        ) {
                            DrawerContent(
                                onMenuClick = { menu ->
                                    scope.launch { drawerState.close() }
                                    when (menu) {
                                        "premium" -> showRateDialog = true
                                        "invite" -> {
                                            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                                                type = "text/plain"
                                                putExtra(Intent.EXTRA_SUBJECT, "Belajar Grammar App")
                                                putExtra(
                                                    Intent.EXTRA_TEXT,
                                                    "Ayo pelajari grammar bahasa Inggris bersama saya!\n\nDownload aplikasinya di:\nhttps://play.google.com/store/apps/details?id=${context.packageName}"
                                                )
                                            }
                                            context.startActivity(Intent.createChooser(shareIntent, "Bagikan aplikasi melalui..."))
                                        }
                                        "about" -> navController.navigate(Routes.ABOUT)
                                        "contact" -> {
                                            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                                                data = Uri.parse("mailto:")
                                                putExtra(Intent.EXTRA_EMAIL, arrayOf("ardianjafar46@gmail.com"))
                                            }
                                            context.startActivity(Intent.createChooser(emailIntent, "Kirim Email menggunakan..."))
                                        }
                                    }
                                },
                                onToggleNightMode = onToggledTheme,
                                onToggleSound = {},
                                isDarkTheme = isDarkTheme
                            )
                        }
                    }
                }
            ) {
                MainScreen(
                    navController = navController,
                    drawerState = drawerState,
                    onDrawerOpen = {
                        scope.launch { drawerState.open() }
                    }
                )
            }

            if (showRateDialog) {
                AlertDialog(
                    onDismissRequest = { showRateDialog = false },
                    title = { Text("⭐ Beri Rating") },
                    text = { Text("Berikan review tentang aplikasi ini di Play Store. Tekan tombol \"Lanjut\" untuk ke Play Store.") },
                    confirmButton = {
                        TextButton(onClick = {
                            showRateDialog = false
                            openPlayStore(context)
                        }) {
                            Text("LANJUT")
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = { showRateDialog = false }) {
                            Text("BATAL")
                        }
                    }
                )
            }
        }

        composable(Routes.GRAMMAR_LIST) { GrammarScreen(navController) }
        composable(Routes.TENSES) { TensesScreen(navController) }
        composable(Routes.VERB) { VerbListScreen(navController) }
        composable(Routes.CONVERSATION) {
            ConversationScreen(navController, ConversationRepository.conversation)
        }

        TenseRepository.tenses.forEach { tense ->
            composable(tense.route) {
                TenseDetailScreen(
                    navController = navController,
                    tensesContent = tense,
                    viewModel = favoriteTenseViewModel
                )
            }
        }

        composable("detail/{title}",
            arguments = listOf(navArgument("title") { type = NavType.StringType })
        ) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            val grammar = GrammarRepository.getByTitle(title)
            grammar?.let {
                GrammarDetailScreen(
                    navController = navController,
                    grammarContent = it,
                    viewModel = favoriteGrammarViewModel
                )
            }
        }

        composable("mistake_list") {
            MistakeListScreen(
                navController = navController,
                onBackClick = { navController.popBackStack() },
                viewModel = mistakeProgressViewModel,
            )
        }

        composable(
            "mistake_items/{categoryId}",
            arguments = listOf(navArgument("categoryId") { type = NavType.StringType })
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
            MistakeItemsScreen(
                navController = navController,
                categoryId = categoryId,
                onBackClick = { navController.popBackStack() },
            )
        }

        composable(
            "mistake_detail/{categoryId}/{index}",
            arguments = listOf(
                navArgument("categoryId") { type = NavType.StringType },
                navArgument("index") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
            val index = backStackEntry.arguments?.getInt("index") ?: 0

            MistakeDetailScreen(
                categoryId = categoryId,
                index = index,
                onBackClick = { navController.popBackStack() },
                viewModel = mistakeProgressViewModel,
            )
        }

        composable("certificate_quiz") {
            CertificateQuizScreen(navController = navController)
        }
    }
}
