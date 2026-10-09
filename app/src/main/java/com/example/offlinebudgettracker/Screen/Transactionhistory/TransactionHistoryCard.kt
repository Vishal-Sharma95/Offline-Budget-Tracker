package com.example.offlinebudgettracker.Screen.Transactionhistory

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.offlinebudgettracker.Model.TransactionHistoryCardmodel
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.WarmOrange

@Composable
 fun TransactionHistoryCard(transactionCard: TransactionHistoryCardmodel) {


    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier.fillMaxWidth()) {



        Row(modifier = Modifier.fillMaxWidth().padding(8.dp)) {


            Row(modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(transactionCard.icon),
                    contentDescription = transactionCard.title,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp).background(
                        color = transactionCard.color,
                        shape = RoundedCornerShape(16.dp)
                    ).padding(10.dp))


                //Second Column started;

                Column(
                    modifier = Modifier.padding(start = 18.dp)) {
                    Text(transactionCard.title,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    Text(transactionCard.category,
                        fontSize = 15.sp,
                        color = Color.Gray.copy(0.7f),
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Column(verticalArrangement = Arrangement.spacedBy(5.dp),
                horizontalAlignment = Alignment.End) {
                Text("$${transactionCard.Paid}",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 15.sp)

                Text(transactionCard.time.toString(),
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                    )
            }

        }


    }
}