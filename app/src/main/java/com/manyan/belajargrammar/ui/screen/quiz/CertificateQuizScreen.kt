package com.manyan.belajargrammar.ui.screen.quiz

import AppTopBar
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.manyan.belajargrammar.data.repository.QuizRepository
import com.manyan.belajargrammar.ui.screen.component.QuizQuestionCard

@Composable
fun CertificateQuizScreen(navController: NavHostController) {
    val allQuestions = remember { QuizRepository.getSampleQuestions() }
    var currentPage by remember { mutableStateOf(0) }
    val questionsPerPage = 5
    val totalPages = (allQuestions.size + questionsPerPage - 1) / questionsPerPage
    val selectedAnswers =
        remember { mutableStateListOf<Int?>().apply { repeat(allQuestions.size) { add(null) } } }
    var showErrors by remember { mutableStateOf(false) }
    val context = LocalContext.current

    val currentQuestions = allQuestions.drop(currentPage * questionsPerPage).take(questionsPerPage)

    Scaffold(
        topBar = {
            AppTopBar(
                title = "English Quiz",
                showBackButton = true,
                onBackClick = { navController.popBackStack() }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier.weight(1f),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                itemsIndexed(currentQuestions) { index, question ->
                    val globalIndex = currentPage * questionsPerPage + index
                    QuizQuestionCard(
                        question = question,
                        questionIndex = globalIndex,
                        selectedAnswer = selectedAnswers[globalIndex],
                        onAnswerSelected = { selectedAnswers[globalIndex] = it },
                        showError = showErrors && selectedAnswers[globalIndex] == null
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Previous button
                if (currentPage > 0) {
                    OutlinedButton(onClick = { currentPage-- }) {
                        Text("Previous")
                    }
                }

                val isCurrentPageComplete = currentQuestions.indices.all { localIndex ->
                    val globalIndex = currentPage * questionsPerPage + localIndex
                    selectedAnswers[globalIndex] != null
                }

                // Next or Submit button
                if (currentPage < totalPages - 1) {
                    OutlinedButton(onClick = {
                        if (!isCurrentPageComplete) {
                            showErrors = true
                            Toast.makeText(
                                context,
                                "Please answer all questions on this page.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            showErrors = false
                            currentPage++
                        }
                    }) {
                        Text("Next")
                    }
                } else {
                    OutlinedButton(onClick = {
                        val isAllComplete = selectedAnswers.none { it == null }

                        if (!isAllComplete) {
                            showErrors = true
                            Toast.makeText(
                                context,
                                "Please answer all questions before submitting.",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            showErrors = false
                            // Kalkulasi yang benar berdasarkan seluruh jawaban
                            val score = selectedAnswers.mapIndexed { index, answer ->
                                if (answer == allQuestions[index].correctAnswerIndex) 1 else 0
                            }.sum()

                            Toast.makeText(
                                context,
                                "You got $score out of ${allQuestions.size} correct!",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    })
                    {
                        Text("Submit")
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}



