package com.manyan.belajargrammar

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.manyan.belajargrammar.data.local.database.AppDatabase
import com.manyan.belajargrammar.data.repository.favorite.FavoriteGrammarRepository
import com.manyan.belajargrammar.data.repository.favorite.FavoriteTenseRepository
import com.manyan.belajargrammar.navigation.AppNavGraph
import com.manyan.belajargrammar.ui.theme.BelajarGrammarTheme
import com.manyan.belajargrammar.ui.viewmodel.FavoriteGrammarViewModel
import com.manyan.belajargrammar.ui.viewmodel.FavoriteTenseViewModel
import com.manyan.belajargrammar.ui.ThemeViewModel as ThemeViewModel1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi Room Database
        val database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "grammar_app_db"
        ).build()

        // Inisialisasi Repository untuk fitur Favorite
        val grammarRepository = FavoriteGrammarRepository(database.favoriteDao())
        val tenseRepository = FavoriteTenseRepository(database.favoriteDao())

        val favoriteGrammarViewModel = FavoriteGrammarViewModel(grammarRepository)
        val favoriteTenseViewModel = FavoriteTenseViewModel(tenseRepository)

        setContent {
            val navController = rememberNavController()
            val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

            val themeViewModel: ThemeViewModel1 = viewModel()
            val isDarkTheme by themeViewModel.isDarkTheme

            BelajarGrammarTheme(darkTheme = isDarkTheme) {
                AppNavGraph(
                    navController = navController,
                    favoriteGrammarViewModel = favoriteGrammarViewModel,
                    favoriteTenseViewModel = favoriteTenseViewModel,
                    database = database,
                    drawerState = drawerState,
                    isDarkTheme = isDarkTheme,
                    onToggledTheme = { themeViewModel.setDarkTheme(it) }
                )
            }
        }
    }
}

fun openPlayStore(context: Context) {
    val packageName = context.packageName
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    try {
        context.startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        context.startActivity(
            Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName"))
        )
    }
}




