package com.manyan.belajargrammar.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.pager.*
import com.manyan.belajargrammar.data.model.VerbEntry
import com.manyan.belajargrammar.data.repository.VerbRepository
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class, ExperimentalMaterial3Api::class)
@Composable
fun VerbListScreen(navController: NavController) {
    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()
    val tabs = listOf("Irregular Verbs", "Regular Verbs")
    var query by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("English Verbs", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            TabRow(selectedTabIndex = pagerState.currentPage) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = pagerState.currentPage == index,
                        onClick = {
                            scope.launch { pagerState.animateScrollToPage(index) }
                        },
                        text = { Text(title) }
                    )
                }
            }

            HorizontalPager(count = tabs.size, state = pagerState) { page ->
                val allVerbs = if (page == 0) VerbRepository.irregularverbs else VerbRepository.regularverbs
                val filteredVerbs = remember(query, allVerbs) {
                    allVerbs.filter {
                        it.baseForm.contains(query, ignoreCase = true) ||
                                it.pastSimple.contains(query, ignoreCase = true) ||
                                it.pastParticiple.contains(query, ignoreCase = true) ||
                                it.meaning.contains(query, ignoreCase = true)
                    }
                }

                Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                    OutlinedTextField(
                        value = query,
                        onValueChange = { query = it },
                        label = { Text("Search verb...") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    TableHeader()
                    Divider(thickness = 1.dp)
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(vertical = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        items(filteredVerbs) { verb ->
                            VerbRow(verb)
                            Divider(thickness = 0.5.dp)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TableHeader() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("Base", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
        Text("Past", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
        Text("Participle", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
        Text("Meaning", modifier = Modifier.weight(1f), fontWeight = FontWeight.Bold)
    }
}

@Composable
fun VerbRow(verb: VerbEntry) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(verb.baseForm, modifier = Modifier.weight(1f))
        Text(verb.pastSimple, modifier = Modifier.weight(1f))
        Text(verb.pastParticiple, modifier = Modifier.weight(1f))
        Text(verb.meaning, modifier = Modifier.weight(1f))
    }
}
