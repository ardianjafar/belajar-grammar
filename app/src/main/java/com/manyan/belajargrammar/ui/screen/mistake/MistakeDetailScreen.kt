package com.manyan.belajargrammar.ui.screen.mistake

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.manyan.belajargrammar.data.repository.MistakeRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MistakeDetailScreen(categoryId: String, index: Int, onBackClick: () -> Unit) {
    val item = MistakeRepository.getItem(categoryId, index) ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(item.title, maxLines = 1, overflow = TextOverflow.Ellipsis)
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
        ) {
            Text(text = item.title, style = MaterialTheme.typography.titleLarge)
            Spacer(Modifier.height(24.dp))

            item.examples.forEach {
                Column(modifier = Modifier.padding(vertical = 8.dp)) {
                    Text(text = "✘ Incorrect: ${it.incorrect}", color = Color.Red)
                    Text(
                        text = "✔ Correct: ${it.correct}",
                        color = Color.Green,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}


