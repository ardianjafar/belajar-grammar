package com.manyan.belajargrammar.ui.screen.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manyan.belajargrammar.data.model.QuizQuestion

@Composable
fun QuizQuestionCard(
    question: QuizQuestion,
    questionIndex: Int,
    selectedAnswer: Int?,
    onAnswerSelected: (Int) -> Unit,
    showError: Boolean
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .then(
                if (showError) Modifier.border(2.dp, Color.Red, shape = RoundedCornerShape(16.dp))
                else Modifier
            ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFEDE7F6)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Q${questionIndex + 1}: ${question.question}",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = 16.sp,
                    color = Color.Black
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            question.options.forEachIndexed { index, option ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedAnswer == index,
                        onClick = { onAnswerSelected(index) },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = MaterialTheme.colorScheme.primary
                        )
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = option, fontSize = 15.sp)
                }
            }
        }
    }
}
