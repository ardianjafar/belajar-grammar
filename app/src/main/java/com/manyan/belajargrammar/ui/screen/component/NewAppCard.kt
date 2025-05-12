package com.manyan.belajargrammar.ui.screen.component

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.manyan.belajargrammar.ui.theme.BlueBackground

@Composable
fun NewAppCard(
    title: String,
    description: String,
    icon: Int,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    val whatsAppUrl = "https://wa.me/6282245959024?text=" +
            Uri.encode("Halo saya tertarik untuk mengikuti tes IELTS pada aplikasi Belajar Grammar, bagaimana saya daftar untuk jadwal tes tersebut ?")

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, shape = RoundedCornerShape(16.dp))
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(whatsAppUrl))
                context.startActivity(intent)
            }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = title,
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, fontWeight = FontWeight.Bold, color = BlueBackground)
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = Color.DarkGray
            )
        }
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "Go",
            modifier = Modifier.size(24.dp),
            tint = Color(0xFF34A853)
        )
    }
}