package com.example.offlinebudgettracker.Screen.Analytics

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun AnalyticsTopBar() {

    TopAppBar(
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.leftbackarrow),
                contentDescription = "left Back",
                modifier = Modifier.size(20.dp)
            )
        },
        title = { Text("Spending Breakdown",
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Black,
                fontSize = 18.sp
            ),
            modifier = Modifier.padding(start = 18.dp))},
        modifier = Modifier.padding(start = 16.dp)

    )
}