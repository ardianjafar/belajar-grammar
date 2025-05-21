package com.manyan.belajargrammar.navigation

object Routes {
    const val WELCOME = "welcome"
    const val MAIN = "main"
    const val GRAMMAR_LIST = "grammar_list"
    const val TENSES = "tenses"
    const val VERB = "verb"

    const val ABOUT = "about"
    const val CONVERSATION = "conversation"

    // Grammar Detail Routes
    const val SIMPLE_PRESENT = "simple_present"
    const val PRESENT_CONTINUOUS = "present_continuous"
    const val PRESENT_PERFECT = "present_perfect"
    const val PRESENT_PERFECT_CONTINUOUS = "present_perfect_continuous"

    const val SIMPLE_PAST = "simple_past"
    const val PAST_CONTINUOUS = "past_continuous"
    const val PAST_PERFECT = "past_perfect"
    const val PAST_PERFECT_CONTINUOUS = "past_perfect_continuous"

    const val SIMPLE_FUTURE = "simple_future"
    const val FUTURE_CONTINUOUS = "future_continuous"
    const val FUTURE_PERFECT = "future_perfect"
    const val FUTURE_PERFECT_CONTINUOUS = "future_perfect_continuous"

    // Dynamic route
    const val DETAIL = "detail/{title}"

    // Mistake
    const val MISTAKE_LIST = "mistake_list"
    const val MISTAKE_ITEMS = "mistake_items/{categoryId}"
    const val MISTAKE_DETAIL = "mistake_detail/{categoryId}/{index}"

    const val CERTIFICATE_QUIZ = "certificate_quiz"

}
