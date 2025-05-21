package com.manyan.belajargrammar.data.repository

import com.manyan.belajargrammar.data.model.QuizQuestion

object QuizRepository {
    fun getSampleQuestions(): List<QuizQuestion> {
        return listOf(
            QuizQuestion("What is the past tense of 'go'?", listOf("goed", "goes", "went", "gone"), 2),
            QuizQuestion("Choose the correct sentence.", listOf("He go to school.", "He goes to school.", "He going to school.", "He gone to school."), 1),
            QuizQuestion("Which is a verb?", listOf("Happy", "Run", "Blue", "Quickly"), 1),
            QuizQuestion("Select the noun.", listOf("Run", "School", "Quickly", "Very"), 1),
            QuizQuestion("Which sentence is in present continuous?", listOf("I eat breakfast.", "I am eating breakfast.", "I ate breakfast.", "I will eat breakfast."), 1),

            QuizQuestion("Michael : .... you a doctor? Jessica: Yes, I ...?", listOf("is/am", "is/are", "are/am", "are/are"), 3),
            QuizQuestion("Michael : .... your name is Julia? Julia: Yes, it ...?", listOf("Is/are", "Are/is", "Is/is", "Are/are"), 3),
            QuizQuestion("Michael : .... your parent in town? Julia: No, they ...?", listOf("Are/isn't", "Is/aren't", "Are/aren't", "Is/is"), 3),

            QuizQuestion("I ... tea?", listOf("drink not", "not drink", "drinking", "don't drink"), 4),
            QuizQuestion("She ... two brothers", listOf("have", "haves", "has", "is having"), 3),
            QuizQuestion("Tom ...  work until 10 today", listOf("doesn't start", "didn't start", "do not start", "doing not start"), 1),

            QuizQuestion("My son ... short in school, but now he ... tall.", listOf("was/is", "were/are", "were/am", "was/are"), 1),
            QuizQuestion("... you at the stadium yesterday? yes, I ...", listOf("Was/was", "Were/were", "Was/were", "Were/was"), 4),
            QuizQuestion("Yesterday Philip and Emma ... in London. Today they ... in Paris", listOf("was/am", "were/are", "were/is", "was/are"), 2),
            QuizQuestion("Manyan ... born in Egypt, and I ... born in Malang.", listOf("were", "is/am", "was/was", "were/am"), 3),



        )
    }
}