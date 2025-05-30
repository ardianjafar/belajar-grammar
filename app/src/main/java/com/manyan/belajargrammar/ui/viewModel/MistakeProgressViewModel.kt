package com.manyan.belajargrammar.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manyan.belajargrammar.data.repository.favorite.LearnedMistakeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MistakeProgressViewModel(private val repository: LearnedMistakeRepository) : ViewModel() {

    private val _learnedMistakes = MutableStateFlow<Set<String>>(emptySet())
    val learnedMistakes: StateFlow<Set<String>> = _learnedMistakes.asStateFlow()

    init {
        viewModelScope.launch {
            val allLearned = repository.getAllLearnedMistakes()
            _learnedMistakes.value = allLearned.map { it.mistakeId }.toSet()
        }
    }

    fun markAsLearned(mistakeId: String) {
        if (!_learnedMistakes.value.contains(mistakeId)) {
            viewModelScope.launch {
                repository.markAsLearned(mistakeId)
                _learnedMistakes.value = _learnedMistakes.value + mistakeId
            }
        }
    }

    fun isLearnedAsState(mistakeId: String): StateFlow<Boolean> {
        return _learnedMistakes.map { it.contains(mistakeId) }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(),
            false
        )
    }

    fun getProgress(): Int {
        return _learnedMistakes.value.size
    }
}
