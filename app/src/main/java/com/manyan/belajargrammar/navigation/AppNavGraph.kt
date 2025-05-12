package com.manyan.belajargrammar.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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


@Composable
    fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.WELCOME) {
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable(route = "about") {
            AboutScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
        composable(Routes.MAIN) { MainScreen(navController) }
        composable(Routes.GRAMMAR_LIST) { GrammarScreen(navController) }
        composable(Routes.TENSES) { TensesScreen(navController) }
        composable(Routes.VERB) {
            VerbListScreen(navController)
        }

        composable(Routes.CONVERSATION) {
            ConversationScreen(navController, conversation)
        }

        val grammarScreens = TenseRepository.tenses
        grammarScreens.forEach { tense ->
            composable(tense.route) {
                TenseDetailScreen(navController, tense)
            }
        }

        composable("simple_present") {
            val tense = TenseRepository.getByRoute("simple_present")
            if (tense != null) {
                TenseDetailScreen(navController, tense)
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
                    title = grammar.title,
                    useCases = grammar.useCases,
                    signalWords = grammar.signalWords
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
    }
}

