package com.example.offlinebudgettracker.Screen.Transactionhistory

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
 fun TransactionHistoryTopBar() {

    TopAppBar(
        title = { Text("Transaction History",
            style = MaterialTheme.typography.titleLarge.copy(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(start = 15.dp))} ,
        navigationIcon = {
            Icon(
            painter = painterResource(R.drawable.leftbackarrow),
                contentDescription = "left arrow",
                modifier = Modifier.size(20.dp)
        )},

        actions = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search icon",
                modifier = Modifier.size(25.dp),
                tint = Color.Black
            )
        }
    )
}