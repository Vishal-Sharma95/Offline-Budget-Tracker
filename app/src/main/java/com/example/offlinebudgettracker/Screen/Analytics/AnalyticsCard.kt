package com.example.offlinebudgettracker.Screen.Analytics

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.Model.DonutModel
import com.example.offlinebudgettracker.ui.theme.ActionBlue
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import kotlin.math.sign

@Composable
 fun AnalyticCard(donutItem: DonutModel) {


    Card(modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )) {
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp).background(color = Color.White)) {

            Box(
                modifier = Modifier.size(20.dp).background(
                    color = donutItem.color,
                    shape = CircleShape
                )
            )


            Column(modifier = Modifier.fillMaxWidth()
                .padding(start = 15.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {


            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {


                Text(
                    donutItem.ItemName,
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold
                    )
                )


                Text(
                    "45%",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color.Black
                    ),
                    modifier = Modifier.background(
                        color = ActionBlue.copy(0.3f),
                        shape = RoundedCornerShape(12.dp)
                    )
                        .padding(vertical = 1.dp, horizontal = 8.dp)
                )

                Text("$${donutItem.spent}",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold
                    )
                )

            }
                Text("Groceries, Restaurants, etc.",
                    style = MaterialTheme.typography.titleSmall.copy(
                        color = Color.Gray
                    ))

        }
        }


    }
}