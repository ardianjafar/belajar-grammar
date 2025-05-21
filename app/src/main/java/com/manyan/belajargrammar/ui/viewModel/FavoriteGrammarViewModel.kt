package com.manyan.belajargrammar.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manyan.belajargrammar.data.local.entity.FavoriteGrammar
import com.manyan.belajargrammar.data.repository.favorite.FavoriteGrammarRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FavoriteGrammarViewModel(private val repository: FavoriteGrammarRepository) : ViewModel() {

    private val _favorites = MutableStateFlow<List<FavoriteGrammar>>(emptyList())
    val favorites: StateFlow<List<FavoriteGrammar>> = _favorites.asStateFlow()

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

    fun toggleFavorite(item: FavoriteGrammar) {
        viewModelScope.launch {
            val isFavorite = repository.isFavorite(item.id)
            if (isFavorite) {
                repository.removeFavorite(item.id)
            } else {
                repository.addFavorite(item)
            }
        }
    }

    suspend fun isFavorite(id: String): Boolean {
        return repository.isFavorite(id)
    }
}