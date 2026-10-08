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
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.WarmOrange

@Preview
@Composable
private fun TransactionHistoryCard() {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier.fillMaxWidth()) {



        Row(modifier = Modifier.fillMaxWidth().padding(8.dp)) {


            Row(modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically) {

                Icon(painter = painterResource(R.drawable.food),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp).background(
                        color = WarmOrange,
                        shape = RoundedCornerShape(16.dp)
                    ).padding(10.dp))


                //Second Column started;

                Column(verticalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.padding(start = 18.dp)) {
                    Text("Grocery Store",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    Text("Food",
                        fontSize = 12.sp,
                        color = Color.Gray.copy(0.8f),
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Column(verticalArrangement = Arrangement.spacedBy(5.dp
            )) {
                Text("-$85.40",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 13.sp)

                Text("10:24 AM",
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                    )
            }

        }


    }
}