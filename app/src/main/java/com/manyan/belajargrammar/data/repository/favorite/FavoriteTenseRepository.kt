package com.manyan.belajargrammar.data.repository.favorite


import com.manyan.belajargrammar.data.local.dao.FavoriteDao
import com.manyan.belajargrammar.data.local.entity.FavoriteTenses
import kotlinx.coroutines.flow.Flow

class FavoriteTenseRepository(private val dao: FavoriteDao) {

    fun getFavorites(): Flow<List<FavoriteTenses>> = dao.getFavoriteTenseList()

    suspend fun addFavorite(tense: FavoriteTenses) = dao.insertFavoriteTense(tense)

    suspend fun removeFavorite(id: String) = dao.deleteFavoriteTenseById(id)

    suspend fun isFavorite(id: String): Boolean = dao.isTenseFavorite(id)
}
