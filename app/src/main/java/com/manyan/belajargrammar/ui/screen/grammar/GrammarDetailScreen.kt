package com.manyan.belajargrammar.ui.screen.grammar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manyan.belajargrammar.data.local.entity.FavoriteGrammar
import com.manyan.belajargrammar.data.model.GrammarContent
import com.manyan.belajargrammar.ui.viewmodel.FavoriteGrammarViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GrammarDetailScreen(
    navController: NavController,
    grammarContent: GrammarContent,
    viewModel: FavoriteGrammarViewModel
) {
    val title = grammarContent.title
    val useCases = grammarContent.useCases
    val signalWords = grammarContent.signalWords
    val coroutineScope = rememberCoroutineScope()
    var isFavorite by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        isFavorite = viewModel.favorites.value.any { it.id == title }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(title, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = {
                        coroutineScope.launch {
                            val grammar = FavoriteGrammar(
                                id = title,
                                title = title,
                                useCases = useCases.joinToString(),
                                signalWords = signalWords.joinToString()
                            )
                            viewModel.toggleFavorite(grammar)
                            isFavorite = !isFavorite
                        }
                    }) {
                        Icon(
                            imageVector = if (isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                            contentDescription = "Favorite"
                        )
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
