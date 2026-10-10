package com.example.offlinebudgettracker.Screen.Budgetlimit

import android.graphics.fonts.Font
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun BudgetTopbar() {
    TopAppBar(
        title = { Text("Budget Limits",
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            ),
            modifier = Modifier.padding(start = 20.dp)) },
        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.leftbackarrow),
                contentDescription = "left navigation",
                modifier = Modifier.size(20.dp)

            )
        }
    )
}