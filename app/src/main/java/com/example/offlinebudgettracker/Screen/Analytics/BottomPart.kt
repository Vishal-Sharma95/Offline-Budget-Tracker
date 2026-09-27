package com.example.offlinebudgettracker.Screen.Analytics

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.offlinebudgettracker.Model.DonutModel

@Composable
 fun BottomPart(donutItem: List<DonutModel>) {

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        item {
            donutItem.forEach { Item->
                AnalyticCard(Item)
            }
        }
    }

}