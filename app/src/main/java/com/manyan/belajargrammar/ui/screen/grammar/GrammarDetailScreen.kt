package com.manyan.belajargrammar.ui.screen.grammar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manyan.belajargrammar.data.model.Section

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GrammarDetailScreen(
    navController: NavController,
    title: String,
    useCases: List<Section>,
    signalWords: List<String>
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(title, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 20.dp, vertical = 12.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text("1. Use of the $title", fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(12.dp))
            useCases.forEach { Text("- $it") }

            Spacer(Modifier.height(20.dp))
            Text("2. Signal Words", fontWeight = FontWeight.Bold)
            signalWords.forEach { Text("- $it") }

            Spacer(Modifier.height(32.dp))
            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.End),
                shape = MaterialTheme.shapes.large
            ) {
                Text("I Learned it")
            }
        }
    }
}
