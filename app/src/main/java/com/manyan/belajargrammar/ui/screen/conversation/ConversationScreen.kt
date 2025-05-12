// ui/screen/ConversationScreen.kt
package com.manyan.belajargrammar.ui.screen.conversation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.manyan.belajargrammar.data.model.ConversationContent
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConversationScreen(navController: NavController, conversations: List<ConversationContent>) {
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    var query by remember { mutableStateOf("") }

    val filtered = conversations.filter {
        it.title.contains(query, ignoreCase = true) ||
                it.useCases.any { line -> line.contains(query, ignoreCase = true) }
    }

    val showScrollToTopButton = remember {
        derivedStateOf { listState.firstVisibleItemIndex > 3 }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Conversation") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },

        floatingActionButton = {
            if (showScrollToTopButton.value) {
                FloatingActionButton(onClick = {
                    scope.launch {
                        listState.animateScrollToItem(index = 0)
                    }
                }) {
                    Icon(
                        Icons.Default.KeyboardArrowUp,
                        contentDescription = "Scroll to Top"
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Search...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )

            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                items(filtered) { section ->
                    Text(
                        text = section.title,
                        fontSize = 18.sp,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    section.useCases.forEach {
                        Text(
                            text = it,
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )
                    }
                }
            }
        }
    }
}




