package com.manyan.belajargrammar.ui.screen.mistake

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.manyan.belajargrammar.data.repository.MistakeRepository
import com.manyan.belajargrammar.ui.viewModel.MistakeProgressViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MistakeDetailScreen(
    categoryId: String,
    index: Int,
    onBackClick: () -> Unit,
    viewModel: MistakeProgressViewModel,
) {
    val item = MistakeRepository.getItem(categoryId, index) ?: return
    val mistakeId = "${categoryId}_${index}"

    val isAlreadyLearned by viewModel.isLearnedAsState(mistakeId).collectAsState()


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(item.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                LazyColumn(modifier = Modifier.weight(1f)) {
                    item {
                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    items(item.examples) { example ->
                        Column(modifier = Modifier.padding(vertical = 8.dp)) {
                            Text("✘ Incorrect: ${example.incorrect}", color = Color.Red)
                            Text("✔ Correct: ${example.correct}", color = Color(0xFF2E7D32), fontWeight = FontWeight.Bold)
                        }
                    }

                    item {
                        Spacer(modifier = Modifier.height(24.dp))
                    }
                }

                OutlinedButton(
                    onClick = {
                        if (!isAlreadyLearned) {
                            viewModel.markAsLearned(mistakeId)
                        }
                    },
                    enabled = !isAlreadyLearned,
                    modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
                ) {
                    Text(if (isAlreadyLearned) "Already Learned" else "I Learned It")
                }

                if (isAlreadyLearned) {
                    Text(
                        text = "✓ Marked as learned!",
                        color = Color(0xFF2E7D32),
                        modifier = Modifier.align(Alignment.End).padding(top = 8.dp)
                    )
                }
            }
        }
    }
}
