package com.manyan.belajargrammar.ui.screen.mistake

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.manyan.belajargrammar.data.repository.MistakeRepository
import com.manyan.belajargrammar.ui.viewModel.MistakeProgressViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MistakeListScreen(
    navController: NavHostController,
    onBackClick: () -> Unit,
    viewModel: MistakeProgressViewModel,
) {

    val learnedMistake by viewModel.learnedMistakes.collectAsState()
    val categories = MistakeRepository.mistakes

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Common Mistakes") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            categories.forEach { category ->
                val learnedCount = learnedMistake.count { it.startsWith(category.id) }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable {
                            navController.navigate("mistake_items/${category.id}")
                        },
                    elevation = CardDefaults.cardElevation()
                ) {
                    Column(Modifier.padding(16.dp)) {
                        Text(text = category.title, fontWeight = FontWeight.Bold)
                        Text(
                            text = "$learnedCount learned / ${category.total} items",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
