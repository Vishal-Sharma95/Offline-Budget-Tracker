package com.example.offlinebudgettracker.Screen.Homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.offlinebudgettracker.Model.CategoryRecordTransaction
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.WarmOrange


@Composable
 fun CategorySelectCard(cardItem: CategoryRecordTransaction) {

    Card(modifier = Modifier.size(width = 110.dp, height = 90.dp).padding(2.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Icon(
                painter = painterResource(cardItem.icon),
                contentDescription =cardItem.name,
                modifier = Modifier.size(40.dp).background(
                    color = cardItem.bg,
                    shape = RoundedCornerShape(18.dp)
                ).padding(10.dp),
                tint = Color.White

            )

            Text(cardItem.name,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                ))
        }
    }
}