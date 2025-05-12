package com.manyan.belajargrammar.data.model


data class GrammarContent(
    val route: String,
    val title: String,
    val useCases: List<Section>,
    val signalWords: List<String>
)
