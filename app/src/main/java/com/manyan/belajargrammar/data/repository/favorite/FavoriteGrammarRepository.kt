package com.manyan.belajargrammar.data.repository.favorite

import com.manyan.belajargrammar.data.local.dao.FavoriteDao
import com.manyan.belajargrammar.data.local.entity.FavoriteGrammar
import kotlinx.coroutines.flow.Flow

class FavoriteGrammarRepository(private val dao: FavoriteDao) {

    fun getFavorites(): Flow<List<FavoriteGrammar>> = dao.getFavoriteGrammarList()

    suspend fun addFavorite(grammar: FavoriteGrammar) = dao.insertFavoriteGrammar(grammar)

    suspend fun removeFavorite(id: String) = dao.deleteFavoriteGrammarById(id)

    suspend fun isFavorite(id: String): Boolean = dao.isGrammarFavorite(id)
}

