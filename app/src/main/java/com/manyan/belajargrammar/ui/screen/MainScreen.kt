package com.manyan.belajargrammar.ui.screen

import AppTopBar
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.DrawerState
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
import com.google.accompanist.flowlayout.FlowRow


@Composable
fun MainScreen(
    navController: NavHostController,
    onDrawerOpen: () -> Unit,
    showMenu: Boolean = true,
    drawerState: DrawerState,
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            AppTopBar(
                title = "GRAMMAR",
                onMenuClick = onDrawerOpen,
                showBackButton = true
            )
        }
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(BlueBackground)
                .padding(paddingValues)
        ) {
            item {
                Column(modifier = Modifier.padding(16.dp)) {
                    Spacer(modifier = Modifier.height(24.dp))
                    // ✅ Explanation Card tetap
                    ExplanationCard(onClick = {
                        navController.navigate(Routes.VERB)
                    })

                    Spacer(modifier = Modifier.height(24.dp))

                    // ✅ Grid Layout 2 Kolom
                    FlowRow(
                        modifier = Modifier.fillMaxWidth(),
                        mainAxisSpacing = 16.dp,
                        crossAxisSpacing = 16.dp
                    ) {
                        FeatureCard(
                            title = "GRAMMAR",
                            description = "Improve Your Grammar Skills",
                            iconId = R.drawable.item,
                            iconBgColor = Color(0xFFFFAF3F)
                        ) { navController.navigate(Routes.GRAMMAR_LIST) }

                        FeatureCard(
                            title = "TENSES",
                            description = "Learn English Tenses",
                            iconId = R.drawable.item,
                            iconBgColor = Color(0xFF42DDF6)
                        ) { navController.navigate(Routes.TENSES) }

                        FeatureCard(
                            title = "CONVERSATION",
                            description = "Most conversation in public",
                            iconId = R.drawable.talking,
                            iconBgColor = Color(0xFF556DF8)
                        ) { navController.navigate(Routes.CONVERSATION) }

                        FeatureCard(
                            title = "MISTAKES",
                            description = "Most mistakes word we used",
                            iconId = R.drawable.file,
                            iconBgColor = Color(0xFFF5487D)
                        ) { navController.navigate("mistake_list") }

                        FeatureCard(
                            title = "CONFUSED",
                            description = "Commonly Confused Words",
                            iconId = R.drawable.faq,
                            iconBgColor = Color(0xFFFFD14C)
                        ) {
                            val url = "https://youtu.be/r_o5g8rBh3Q?si=VOIu2zd29blwWVI1"
                            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
                        }
                    }

                    Spacer(modifier = Modifier.height(32.dp))

                    Text("CERTIFICATE", color = Color.White, fontSize = 14.sp)
                    Spacer(modifier = Modifier.height(8.dp))

//                    NewAppCard(
//                        title = "TAKE A TEST",
//                        description = "Test your English now for Free!!",
//                        icon = R.drawable.certificate,
//                        onClick = {
//                            val url = "https://wa.me/6282245959024?text=" +
//                                    Uri.encode("Halo saya tertarik untuk mengikuti tes IELTS pada aplikasi Belajar Grammar, bagaimana saya daftar untuk jadwal tes tersebut ?")
//                            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
//                        }
//                    )

                    NewAppCard(
                        title = "Quiz English",
                        description = "Test your English simple Question!!",
                        icon = R.drawable.certificate,
                        { navController.navigate("certificate_quiz") }
                    )

                }
            }
        }
    }
}

