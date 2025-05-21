package com.manyan.belajargrammar.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.ui.text.font.FontWeight
import com.manyan.belajargrammar.R
import com.manyan.belajargrammar.ui.theme.BlueCard


@Composable
fun DrawerContent(
    onMenuClick: (String) -> Unit,
    onToggleSound: (Boolean) -> Unit,
    onToggleNightMode : (Boolean) -> Unit,
    isDarkTheme: Boolean
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.82f)
            .background(BlueCard) // dark blue nav drawer background
            .padding(horizontal = 16.dp, vertical = 32.dp)
    ) {
        // Title
        Text(
            text = "GRAMMAR",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "LEARN GRAMMAR EASILY",
            color = Color.White.copy(alpha = 0.8f),
            fontSize = 12.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Items
        DrawerItem("Rate Us", R.drawable.review) {
            onMenuClick("premium")
        }
        DrawerToggleItem(
            title = "Night Mode",
            icon = R.drawable.moon,
            initialState = isDarkTheme,
            onToggle = { onToggleNightMode(it) }
        )
//        DrawerToggleItem("Sound", Icons.Default.Settings, initialState = true) {
//            onToggleSound(it)
//        }

        Spacer(modifier = Modifier.height(12.dp))
        Divider(color = Color.White.copy(alpha = 0.3f), thickness = 1.dp)
        Spacer(modifier = Modifier.height(12.dp))

        DrawerItem("Invite Friends", R.drawable.ic_share) {
            onMenuClick("invite")
        }
        DrawerItem("About Us", R.drawable.file) {
            onMenuClick("about")
        }
        DrawerItem("Contact Us", R.drawable.email) {
            onMenuClick("contact")
        }
    }
}


