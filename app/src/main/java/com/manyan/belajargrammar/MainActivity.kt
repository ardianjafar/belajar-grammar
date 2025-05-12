package com.manyan.belajargrammar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.manyan.belajargrammar.navigation.AppNavGraph
import com.manyan.belajargrammar.ui.theme.BelajarGrammarTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarGrammarTheme {
                val navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val themeViewModel : ThemeViewModel by viewModels()
//        setContent {
//            val isDarkTheme by themeViewModel.isDarkTheme.collectAsState()
//            BelajarGrammarTheme(darkTheme = isDarkTheme) {
//                val navController = rememberNavController()
//                AppNavGraph(navController = navController,  themeViewModel = themeViewModel)
//            }
//        }
//    }
//}