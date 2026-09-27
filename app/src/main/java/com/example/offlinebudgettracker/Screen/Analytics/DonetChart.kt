package com.example.offlinebudgettracker.Screen.Analytics

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.Model.DonutModel
import com.example.offlinebudgettracker.ui.theme.ActionBlue
import com.example.offlinebudgettracker.ui.theme.WarmOrange


@Composable
 fun DonetChart(donutItem: List<DonutModel>) {

     var TotalSpent = donutItem.sumOf{it.spent.toDouble()}.toFloat()
    //These value will pass

    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

        Box(modifier = Modifier.size(300.dp),
            contentAlignment = Alignment.Center) {

        Canvas(
            modifier = Modifier.size(200.dp),
            contentDescription = "Donut Pie Chart"
        ) {

            var currentAngle = -90f

            donutItem.forEach { item ->
                val sweepangle = (item.spent.toFloat() / TotalSpent) * 360f
                drawArc(
                    color = item.color,
                    startAngle = currentAngle,
                    sweepAngle = (sweepangle),
                    useCenter = false,
                    style = Stroke(200f)
                )

                currentAngle += sweepangle;
            }
        }

            Column(modifier = Modifier.background(color = Color.Gray.copy(0.4f),
                shape = CircleShape
            )
                .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                Text(text = "Total Spent",
                   style = MaterialTheme.typography.titleLarge.copy(
                       fontWeight = FontWeight.Bold,
                       fontSize = 13.sp
                   ))

                Text(text = "$${TotalSpent}",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)


                Text(text = "This Month",
                   style = MaterialTheme.typography.titleSmall.copy(
                       fontWeight = FontWeight.Medium,
                       color = Color.DarkGray,
                       fontSize = 12.sp
                   ))
            }
    }

    }
}

