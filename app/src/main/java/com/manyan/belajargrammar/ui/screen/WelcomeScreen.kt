// ui/screen/WelcomeScreen.kt
package com.manyan.belajargrammar.ui.screen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.manyan.belajargrammar.R
import com.manyan.belajargrammar.navigation.Routes
import com.manyan.belajargrammar.ui.theme.WhiteBackground
import kotlinx.coroutines.delay

@Composable
fun WelcomeScreen(navController: NavController) {
    var visible by remember { mutableStateOf(false) }

    // State untuk efek mengetik
    val fullText = "Learn Grammar Easily...."
    var displayedText by remember { mutableStateOf("") }

    LaunchedEffect(true) {
        visible = true

        // Efek ketik satu huruf per 100ms
        for (i in 1..fullText.length) {
            displayedText = fullText.substring(0, i)
            delay(80L)
        }

        // Tahan sebentar sebelum berpindah screen
        delay(1200)
        navController.navigate(Routes.MAIN) {
            popUpTo(Routes.WELCOME) { inclusive = true }
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = slideInHorizontally(initialOffsetX = { -it }) + fadeIn(),
            exit = fadeOut()
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(250.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "BELAJAR GRAMMAR",
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))

                // Text berjalan seperti diketik
                Text(
                    text = displayedText,
                    color = Color.DarkGray,
                    fontSize = 16.sp
                )
            }
        }
    }
}

