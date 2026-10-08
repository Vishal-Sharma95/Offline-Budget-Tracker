package com.example.offlinebudgettracker.Screen.Budgetlimit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
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
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.Model.BudgetLimitmodel
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.CoralRed
import com.example.offlinebudgettracker.ui.theme.GreenCard
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import kotlin.math.roundToInt


@Composable
 fun BudgetlimitCard(budgetLimitlist : BudgetLimitmodel) {

     var totalSpentPercent = ((budgetLimitlist.totalSpent.toFloat())/(budgetLimitlist.totalLimit.toFloat()))*100.0f
     totalSpentPercent = (totalSpentPercent * 100).roundToInt() / 100.0f
    //*******************Method to keep the two digit after decimal;

    Box(modifier = Modifier.fillMaxWidth().background(color = Color.Transparent).padding(4.dp)) {
        Card(modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp
            )) {
            Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {

                //First Row
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically) {
                    Row(verticalAlignment =Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(16.dp)) {

                        Icon(
                            painter = painterResource(budgetLimitlist.icon),
                            contentDescription = budgetLimitlist.name,
                            tint = Color.White,
                            modifier = Modifier.size(40.dp).background(
                                color = budgetLimitlist.contentColor,
                                shape = RoundedCornerShape(16.dp)
                            ).padding(10.dp)
                        )

                        Text(text = budgetLimitlist.name,
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            ))
                    }


                    Row() {
                        Text("${totalSpentPercent}% Limit Reached",
                            modifier = Modifier.background(
                                color = when{
                                    totalSpentPercent < 70 -> GreenCard.copy(0.2f)
                                    totalSpentPercent < 90 -> WarmOrange.copy(0.2f)
                                    totalSpentPercent <=100 -> CoralRed.copy(0.2f)
                                    else -> WarmOrange
                                },
                                shape = RoundedCornerShape(25.dp)
                            ).padding(horizontal = 8.dp, vertical = 2.dp),
                            color = when{
                                totalSpentPercent < 70 -> GreenCard
                                totalSpentPercent < 90 -> WarmOrange
                                totalSpentPercent <=100 -> CoralRed
                                else -> WarmOrange
                            },
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Black)
                    }


                }//First Row ended

                //Second Row

                Row() {
                    Text( text = "$${budgetLimitlist.totalSpent} ",
                        fontSize = 12.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Black)
                    Text(text = "/ $${budgetLimitlist.totalLimit}",
                        color = Color.Gray,
                        fontWeight = FontWeight.Black,
                        fontSize = 12.sp)
                }
                //Second Row ended;

                //3rd Row Started;

                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {

                    LinearProgressIndicator(
                        progress = {(totalSpentPercent/100)},
                        modifier = Modifier.height(12.dp)
                            .weight(1f).fillMaxWidth(),
                        color = when{
                            (totalSpentPercent < 70) -> GreenCard
                            (totalSpentPercent < 90) -> WarmOrange
                            (totalSpentPercent <=100) -> CoralRed
                            else -> WarmOrange
                        },
                        trackColor = Color.LightGray.copy(0.3f),
                        drawStopIndicator = {}

                    )

                    Text(
                        text = "${totalSpentPercent}%",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.padding(start = 8.dp)

                    )
                }




            }
        }
    }

}