package com.manyan.belajargrammar.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.manyan.belajargrammar.data.repository.favorite.LearnedMistakeRepository

class MistakeProgressViewModelFactory(
    private val repository: LearnedMistakeRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MistakeProgressViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MistakeProgressViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
