package com.manyan.belajargrammar.navigation

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.manyan.belajargrammar.data.local.database.AppDatabase
import com.manyan.belajargrammar.data.repository.ConversationRepository.conversation
import com.manyan.belajargrammar.data.repository.GrammarRepository
import com.manyan.belajargrammar.data.repository.TenseRepository
import com.manyan.belajargrammar.ui.screen.MainScreen
import com.manyan.belajargrammar.ui.screen.about.AboutScreen
import com.manyan.belajargrammar.ui.screen.conversation.ConversationScreen
import com.manyan.belajargrammar.ui.screen.grammar.GrammarDetailScreen
import com.manyan.belajargrammar.ui.screen.grammar.GrammarScreen
import com.manyan.belajargrammar.ui.screen.VerbListScreen
import com.manyan.belajargrammar.ui.screen.mistake.MistakeDetailScreen
import com.manyan.belajargrammar.ui.screen.mistake.MistakeItemsScreen
import com.manyan.belajargrammar.ui.screen.mistake.MistakeListScreen
import com.manyan.belajargrammar.ui.screen.tenses.TenseDetailScreen
import com.manyan.belajargrammar.ui.screen.tenses.TensesScreen
import com.manyan.belajargrammar.ui.screen.WelcomeScreen
import com.manyan.belajargrammar.ui.viewmodel.FavoriteGrammarViewModel
import com.manyan.belajargrammar.ui.viewmodel.FavoriteTenseViewModel
import kotlinx.coroutines.launch
import com.manyan.belajargrammar.openPlayStore
import com.manyan.belajargrammar.ui.screen.quiz.CertificateQuizScreen



@Composable
fun AppNavGraph(
    navController: NavHostController,
    database: AppDatabase,
    favoriteGrammarViewModel: FavoriteGrammarViewModel,
    favoriteTenseViewModel: FavoriteTenseViewModel,
    onToggledTheme: (Boolean) -> Unit,
    isDarkTheme: Boolean,
    drawerState: DrawerState
) {
    NavHost(navController = navController, startDestination = Routes.WELCOME) {
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable(route = "about") {
            AboutScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
//        composable(Routes.MAIN) { MainScreen(navController, onDrawerOpen = {} ) }
        composable(Routes.MAIN) {
            val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
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
                                .width(LocalConfiguration.current.screenWidthDp.dp * 0.7f) // Setengah lebar layar
                                //.background(Color(0xFF4CAF50)) // Warna latar hijau, sesuaikan jika perlu

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
                                        "about" -> navController.navigate("about")
                                        "contact" -> {
                                            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                                                data = Uri.parse("mailto:")
                                                putExtra(Intent.EXTRA_EMAIL, arrayOf("ardianjafar46@gmail.com"))
                                            }
                                            context.startActivity(Intent.createChooser(emailIntent, "Kirim Email menggunakan..."))
                                        }
                                    }
                                },
                                onToggleNightMode = { onToggledTheme(it) },
                                onToggleSound = { isOn -> /* toggle sound */ },
                                isDarkTheme = isDarkTheme
                            )
                        }
                    }
                },
                gesturesEnabled = true
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
                    text = {
                        Text("Berikan review tentang aplikasi ini di Play Store, bintang ke lima adalah review terbaik. Tekan tombol \"Lanjut\" untuk ke Play Store.")
                    },
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
        composable(Routes.VERB) {
            VerbListScreen(navController)
        }

        composable(Routes.CONVERSATION) {
            ConversationScreen(navController, conversation)
        }

        val tensesScreens = TenseRepository.tenses
        tensesScreens.forEach { tense ->
            composable(tense.route) {
                TenseDetailScreen(
                    navController = navController,
                    tensesContent = tense,
                    viewModel = favoriteTenseViewModel
                )
            }
        }

        composable("simple_present") {
            val tense = TenseRepository.getByRoute("simple_present")
            if (tense != null) {
                TenseDetailScreen(
                    navController = navController,
                    tensesContent = tense,
                    viewModel = favoriteTenseViewModel
                )
            }
        }
        composable(
            "detail/{title}",
            arguments = listOf(navArgument("title") { type = NavType.StringType })
        ) { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            val grammar = GrammarRepository.getByTitle(title)
            if (grammar != null) {
                GrammarDetailScreen(
                    navController = navController,
                    grammarContent = grammar,
                    viewModel = favoriteGrammarViewModel
                )
            }
        }

        composable("mistake_list") {
            MistakeListScreen(
                navController = navController,
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("mistake_items/{categoryId}") { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: return@composable
            MistakeItemsScreen(
                navController = navController,
                categoryId = categoryId,
                onBackClick = { navController.popBackStack() }
            )
        }

        composable("mistake_detail/{categoryId}/{index}",
            arguments = listOf(
                navArgument("categoryId") { type = NavType.StringType },
                navArgument("index") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val categoryId = backStackEntry.arguments?.getString("categoryId") ?: ""
            val index = backStackEntry.arguments?.getInt("index") ?: 0
            MistakeDetailScreen(categoryId, index, onBackClick = { navController.popBackStack() })
        }

        composable("certificate_quiz") {
            CertificateQuizScreen(
                navController = navController
            )
        }


    }
}

