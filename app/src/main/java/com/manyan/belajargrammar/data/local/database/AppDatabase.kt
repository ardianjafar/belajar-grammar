package com.manyan.belajargrammar.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.manyan.belajargrammar.data.local.dao.FavoriteDao
import com.manyan.belajargrammar.data.local.entity.FavoriteGrammar
import com.manyan.belajargrammar.data.local.entity.FavoriteTenses

@Database(entities = [FavoriteGrammar::class, FavoriteTenses::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
}
