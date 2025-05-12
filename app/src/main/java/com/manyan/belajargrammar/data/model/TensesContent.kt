package com.manyan.belajargrammar.data.model

data class TensesContent(
    val route: String,
    val title: String,
    val useCases: List<Section>,
    val signalWords: List<String>,
    val testsPassed: Int = 0,
    val totalTests: Int = 0
)
