package com.example.offlinebudgettracker.Screen.Homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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
import com.example.offlinebudgettracker.ui.theme.ActionBlue
import com.example.offlinebudgettracker.ui.theme.AlerttinRed
import com.example.offlinebudgettracker.ui.theme.AppCanvas
import com.example.offlinebudgettracker.ui.theme.CoralRed
import com.example.offlinebudgettracker.ui.theme.Cyan
import com.example.offlinebudgettracker.ui.theme.ElectricPurple
import com.example.offlinebudgettracker.ui.theme.GreenCard
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import com.example.offlinebudgettracker.uicomponent.BottonNavigationBar

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun HomeScreen() {

        Scaffold(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            topBar = { HomeScreenTopBar() },
            bottomBar = { BottonNavigationBar() },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {},
                    containerColor = ActionBlue,
                    elevation = FloatingActionButtonDefaults.elevation(
                        defaultElevation = 8.dp,  // Shadow when sitting idle
                        pressedElevation = 12.dp, // Shadow when the user taps it
                        hoveredElevation = 10.dp, // Shadow when hovered (desktop/mouse)
                        focusedElevation = 10.dp
                    ),
                    shape = CircleShape
                ){
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add floating button",
                        tint = Color.White
                    )}
            }
        ) {innerPadding->

            Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp).padding(innerPadding)
                .background(color = AppCanvas))
            {
                //Card View

                Card(modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = GreenCard
                    )) {
                    Column(modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)) {

                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Text(text = "Total Balance",
                                fontSize = 16.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Medium)

                            Icon(
                                painter = painterResource(R.drawable.eye),
                                contentDescription = "Eye visible icon",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )

                        }

                        //Balance:

                        Text(text = "$2,450.00",
                            fontWeight = FontWeight.Bold,
                            fontSize = 35.sp,
                            color = Color.White)

                        //Income & Expense

                        Row(modifier = Modifier.fillMaxWidth()) {

                            //Income Card
                            Card(modifier = Modifier.weight(1f).height(65.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                )
                                    ) {

                                Row(modifier = Modifier.fillMaxSize().background(
                                    color = GreenCard.copy(0.2f)
                                ),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                    ) {



                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.arrowsmallup),
                                        contentDescription = "Up - Arrow",
                                        modifier = Modifier.size(23.dp),
                                        tint = GreenCard

                                        )

                                    Column(
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(text = "Income",
                                            color = GreenCard)
                                        Text(
                                            "+$3,200.00",
                                            fontWeight = FontWeight.Bold,
                                            color = GreenCard
                                        )
                                    }
                                }
                            }
                            }

                            Spacer(modifier = Modifier.width(16.dp))

                            //Expense Card

                            Card(modifier = Modifier.weight(1f).height(65.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                )) {
                                Row(modifier = Modifier.fillMaxSize().background(color = AlerttinRed.copy(0.2f)),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically) {


                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.arrowdown),
                                        contentDescription = "Down - Arrow",
                                        modifier = Modifier.size(20.dp),
                                        tint = AlerttinRed

                                        )

                                    Column(
                                        verticalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Text(text = "Expense",
                                            color = AlerttinRed)

                                        Text(
                                            "-$750.00",
                                            fontWeight = FontWeight.Bold,
                                            color = AlerttinRed
                                        )
                                    }
                                }
                            }
                            }
                        }
                    }
                }

                //Card view end

                Spacer(modifier = Modifier.height(8.dp))
                //Alert Row
                Card(modifier = Modifier.fillMaxWidth()) {

                    Row(modifier = Modifier.fillMaxWidth().height(50.dp).background(
                        color = CoralRed.copy(0.2f)
                    )
                        .padding(horizontal = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {

                        Row(horizontalArrangement = Arrangement.spacedBy(12.dp),
                            verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painter = painterResource(R.drawable.alert),
                                contentDescription = "alarm icon",
                                modifier = Modifier.size(24.dp),
                                tint = MaterialTheme.colorScheme.error
                            )

                            Text(text = "Leisure limit exceeded",
                                color = MaterialTheme.colorScheme.error,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 16.sp)
                        }

                        Icon(
                            painter = painterResource(R.drawable.regular_outline_arrow_right),
                            contentDescription = "right arrow",
                            modifier = Modifier.size(24.dp),
                            tint = MaterialTheme.colorScheme.error
                        )
                    }
                }//Alert Row is ended;

                Spacer(modifier = Modifier.height(24.dp))
                //Recent Transaction started;

                Row(modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text("Recent Transactions",
                        fontWeight = FontWeight.Black,
                        fontSize = 18.sp)

                    Text("See all",
                        color = Color.Blue,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold)
                }

                Spacer(modifier = Modifier.height(10.dp))



                //list of TransactionCard:

                val TransactionParameter = listOf(
                    TransactionCard(icon = R.drawable.food, technicolor = WarmOrange, Item = "Food", description = "grocery", amount = 85.40),
                TransactionCard(icon = R.drawable.salary, technicolor = GreenCard, Item = "Salary", description = "Company Transfer", amount = 3200.00),
                TransactionCard(icon = R.drawable.rent, technicolor = ActionBlue, Item = "Rent", description = "Apartment", amount = 550.00),
                TransactionCard(icon = R.drawable.entertainment, technicolor = ElectricPurple, Item = "entertainment", description = "Movie", amount = 24.99),
                TransactionCard(icon = R.drawable.transport, technicolor = Cyan, Item = "transport", description = "Uber", amount = 12.50)

                )

                LazyColumn(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item {
                        TransactionParameter.forEach { Card->

                            RecentTransactionCard(Card)
                        }
                    }

                }






            }
        }


}