package com.manyan.belajargrammar.data.repository.favorite

import com.manyan.belajargrammar.data.local.dao.LearnedMistakeDao
import com.manyan.belajargrammar.data.local.entity.LearnedMistakeEntity

class LearnedMistakeRepository(private val dao: LearnedMistakeDao) {

    suspend fun markAsLearned(id: String) {
        if (!dao.isLearned(id)) {
            dao.insertLearnedMistake(LearnedMistakeEntity(id))
        }
    }

    suspend fun isLearned(id: String): Boolean {
        return dao.isLearned(id)
    }

    suspend fun getLearnedCount(): Int {
        return dao.getAllLearnedMistakes().size
    }

    suspend fun getAllLearnedMistakes(): List<LearnedMistakeEntity> {
        return dao.getAllLearnedMistakes()
    }

}
