package com.manyan.belajargrammar.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_tenses")
data class FavoriteTenses(
    @PrimaryKey val id: String,
    val title: String,
    val useCases: String,
    val signalWords: String,
    val type: String = "grammar"
)