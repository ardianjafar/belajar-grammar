package com.manyan.belajargrammar.data.model

data class MistakeExample(
    val incorrect: String,
    val correct: String
)

data class MistakeItem(
    val title: String,
    val examples: List<MistakeExample>
)

data class MistakeContent(
    val id: String,
    val title: String,
    val total: Int,
    val learned: Int,
    val items: List<MistakeItem>
)

