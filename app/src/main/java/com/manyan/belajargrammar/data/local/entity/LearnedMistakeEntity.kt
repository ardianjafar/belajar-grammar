package com.manyan.belajargrammar.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learned_mistakes")
data class LearnedMistakeEntity(
    @PrimaryKey val mistakeId: String
)
