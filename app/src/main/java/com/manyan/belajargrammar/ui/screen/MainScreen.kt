package com.manyan.belajargrammar.ui.screen

import AppTopBar
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manyan.belajargrammar.R
import com.manyan.belajargrammar.navigation.Routes
import com.manyan.belajargrammar.ui.screen.component.ExplanationCard
import com.manyan.belajargrammar.ui.screen.component.FeatureCard
import com.manyan.belajargrammar.ui.screen.component.NewAppCard
import com.manyan.belajargrammar.ui.theme.BlueBackground
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.manyan.belajargrammar.ui.ThemeViewModel


@Composable
fun MainScreen(
    navController: NavHostController,
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            AppTopBar(
                title = "GRAMMAR",
                onAboutClick = { navController.navigate("about") },
                showMenu = true,
            )
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(BlueBackground)
        ) {
            item {
                ExplanationCard(onClick = {
                    navController.navigate(Routes.VERB)
                })

                Spacer(modifier = Modifier.height(16.dp))

                FeatureCard(
                    title = "GRAMMAR",
                    description = "Improve Your Grammar Skills",
                    iconId = R.drawable.ic_grammar,
                    iconBgColor = Color(0xFFFF9800)
                ) {
                    navController.navigate(Routes.GRAMMAR_LIST)
                }

                Spacer(modifier = Modifier.height(16.dp))

                FeatureCard(
                    title = "TENSES",
                    description = "Learn English Tenses",
                    iconId = R.drawable.ic_tenses,
                    iconBgColor = Color(0xFF00BCD4)
                ) {
                    navController.navigate(Routes.TENSES)
                }

                Spacer(modifier = Modifier.height(16.dp))

                FeatureCard(
                    title = "CONVERSATION",
                    description = "Most conversation in public",
                    iconId = R.drawable.ic_tests,
                    iconBgColor = Color(0xFF3F51B5)
                ) {
                    navController.navigate(Routes.CONVERSATION)
                }

                Spacer(modifier = Modifier.height(16.dp))

                FeatureCard(
                    title = "MISTAKES",
                    description = "Most mistakes word we used",
                    iconId = R.drawable.ic_mistakes,
                    iconBgColor = Color(0xFFE91E63)
                ) {
                    navController.navigate("mistake_list")
                }

                Spacer(modifier = Modifier.height(16.dp))

                FeatureCard(
                    title = "CONFUSED",
                    description = "Commonly Confused Words",
                    iconId = R.drawable.ic_confused,
                    iconBgColor = Color(0xFFFFC107)
                ) {
                    val url = "https://youtu.be/r_o5g8rBh3Q?si=VOIu2zd29blwWVI1"
                    context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text("CERTIFICATE", color = Color.White, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp))

                NewAppCard(
                    title = "GET CERTIFICATE",
                    description = "Test your English to get ready for preparation IELTS now for Free!!",
                    icon = R.drawable.ic_learnish,
                    onClick = {
                        val url = "https://wa.me/6282245959024?text=" +
                                Uri.encode("Halo saya tertarik untuk mengikuti tes IELTS pada aplikasi Belajar Grammar, bagaimana saya daftar untuk jadwal tes tersebut ?")
                        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                    }
                )
            }
        }
    }
}

