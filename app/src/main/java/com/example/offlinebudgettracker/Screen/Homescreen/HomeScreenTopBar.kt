package com.example.offlinebudgettracker.Screen.Homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun HomeScreenTopBar() {
    TopAppBar(
        windowInsets = WindowInsets(0.dp),
        title = { Text(text= "My Budget",
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Black,
                fontSize = 18.sp
            ),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center) },

        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "menu icon",
                modifier = Modifier.size(30.dp)
            )
        },

        actions = {
            Icon(
                painter = painterResource(R.drawable.profile),
                contentDescription = "Profile icon",
                tint = Color.DarkGray,
                modifier = Modifier
                    .size(30.dp)
                    .background(
                        color = Color.DarkGray.copy(alpha = 0.1f),
                        shape = CircleShape
                    )
                    .padding(8.dp)
            )
        }
    )
}