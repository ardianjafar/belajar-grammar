package com.manyan.belajargrammar.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.manyan.belajargrammar.data.local.entity.LearnedMistakeEntity

@Dao
interface LearnedMistakeDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertLearnedMistake(entity: LearnedMistakeEntity)

    @Query("SELECT * FROM learned_mistakes")
    suspend fun getAllLearnedMistakes(): List<LearnedMistakeEntity>

    @Query("SELECT EXISTS(SELECT 1 FROM learned_mistakes WHERE mistakeId = :id)")
    suspend fun isLearned(id: String): Boolean

}