package com.manyan.belajargrammar.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.manyan.belajargrammar.data.local.dao.FavoriteDao
import com.manyan.belajargrammar.data.local.dao.LearnedMistakeDao
import com.manyan.belajargrammar.data.local.entity.FavoriteGrammar
import com.manyan.belajargrammar.data.local.entity.FavoriteTenses
import com.manyan.belajargrammar.data.local.entity.LearnedMistakeEntity

@Database(
    entities = [
        FavoriteGrammar::class,
        FavoriteTenses::class,
        LearnedMistakeEntity::class  // ini yang benar, karena ini adalah @Entity
    ],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
    abstract fun learnedMistakeDao(): LearnedMistakeDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "grammar_app_database"
                ).fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
