// ui/screen/TenseDetailScreen.kt
package com.manyan.belajargrammar.ui.screen.tenses

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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.manyan.belajargrammar.data.local.entity.FavoriteTenses
import com.manyan.belajargrammar.data.model.TensesContent
import com.manyan.belajargrammar.ui.viewmodel.FavoriteTenseViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TenseDetailScreen(
    navController: NavController,
    tensesContent: TensesContent,
    viewModel: FavoriteTenseViewModel
) {
    val title = tensesContent.title
    val useCases = tensesContent.useCases
    val signalWords = tensesContent.signalWords
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
                            val tense = FavoriteTenses(
                                id = title,
                                title = title,
                                useCases = useCases.joinToString(),
                                signalWords = signalWords.joinToString()
                            )
                            viewModel.toggleFavorite(tense)
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
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            tensesContent.useCases.forEachIndexed { index, section ->
                SectionHeader("${index + 1}. ${section.title}")
                SectionContent(section.content)
            }

            Spacer(modifier = Modifier.height(24.dp))
            SectionHeader("Signal Words")
            SectionContent(tensesContent.signalWords)

            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.End),
                shape = MaterialTheme.shapes.large
            ) {
                Text("Kembali")
            }
        }
    }
}


@Composable
fun SectionHeader(text: String) {
    Text(
        text,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        modifier = Modifier.padding(vertical = 12.dp)
    )
}

@Composable
fun SectionContent(lines: List<String>) {
    lines.forEach {
        Text(it, fontSize = 14.sp, modifier = Modifier.padding(bottom = 4.dp))
    }
}
