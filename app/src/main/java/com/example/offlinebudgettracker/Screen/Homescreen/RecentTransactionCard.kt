package com.example.offlinebudgettracker.Screen.Homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.Model.TransactionCard
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.WarmOrange

@Composable
 fun RecentTransactionCard(TransactionParameter: TransactionCard) {


    Card(modifier = Modifier.fillMaxWidth().padding(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        ) {

        Row(modifier = Modifier.fillMaxWidth().padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
            ) {

            Row(modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
                ) {
                Icon(
                    painter = painterResource(TransactionParameter.icon),
                    contentDescription = TransactionParameter.description,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp).background(
                        color = TransactionParameter.technicolor,
                        shape = RoundedCornerShape(16.dp)
                    )
                        .padding(10.dp)
                )

                Column() {
                    Text(text = TransactionParameter.Item,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = TransactionParameter.description,
                        fontSize = 12.sp,
                        color = Color.Gray)
                }
            }

            Column() {
                Text("-$${TransactionParameter.amount}",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(4.dp))

                Text("Today, 10:24",
                    fontSize = 12.sp,
                    color = Color.Gray)
            }
        }
    }
    Spacer(modifier = Modifier.height(2.dp))
}