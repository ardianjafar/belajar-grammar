import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.manyan.belajargrammar.ui.ThemeViewModel
import com.manyan.belajargrammar.ui.theme.BluePrimary

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    onAboutClick: () -> Unit,
    showMenu: Boolean = true,
): Unit = TopAppBar(
    title = {
        Column {
            Text(title, fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White)
            Text(
                "LEARN GRAMMAR EASILY",
                fontSize = 12.sp,
                color = Color.White.copy(alpha = 0.8f)
            )
        }
    },
    colors = TopAppBarDefaults.topAppBarColors(containerColor = BluePrimary),
    actions = {
        if (showMenu) {
            var menuExpanded by remember { mutableStateOf(false) }

            IconButton(onClick = { menuExpanded = true }) {
                Icon(
                    Icons.Default.MoreVert,
                    contentDescription = "Settings",
                    tint = Color.White
                )
            }

            DropdownMenu(
                expanded = menuExpanded,
                onDismissRequest = { menuExpanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("About") },
                    onClick = {
                        menuExpanded = false
                        onAboutClick()
                    }
                )
                DropdownMenuItem(
                    text = { Text("Dark Mode") },
                    onClick = {
                        menuExpanded = false
                    }
                )
            }
        }
    }
)
