package com.manyan.belajargrammar.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manyan.belajargrammar.data.local.entity.FavoriteTenses
import com.manyan.belajargrammar.data.repository.favorite.FavoriteTenseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FavoriteTenseViewModel(private val repository: FavoriteTenseRepository) : ViewModel() {

    private val _favorites = MutableStateFlow<List<FavoriteTenses>>(emptyList())
    val favorites: StateFlow<List<FavoriteTenses>> = _favorites.asStateFlow()

    init {
        loadFavorites()
    }

    private fun loadFavorites() {
        viewModelScope.launch {
            repository.getFavorites().collect {
                _favorites.value = it
            }
        }
    }

    fun toggleFavorite(item: FavoriteTenses) {
        viewModelScope.launch {
            val isFavorite = repository.isFavorite(item.id)
            if (isFavorite) {
                repository.removeFavorite(item.id)
            } else {
                repository.addFavorite(item)
                Log.d("FavoriteTenseViewModel", "Favorite tense added: ${item.title}")
            }
        }
    }

    suspend fun isFavorite(id: String): Boolean {
        return repository.isFavorite(id)
    }
}
