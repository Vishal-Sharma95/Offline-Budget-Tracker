package com.example.offlinebudgettracker.Screen.Homescreen


import android.content.ClipData
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.offlinebudgettracker.Model.CategoryRecordTransaction
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.ActionBlue
import com.example.offlinebudgettracker.ui.theme.AlerttinRed
import com.example.offlinebudgettracker.ui.theme.Cyan
import com.example.offlinebudgettracker.ui.theme.ElectricPurple
import com.example.offlinebudgettracker.ui.theme.GreenCard
import com.example.offlinebudgettracker.ui.theme.WarmOrange

@Preview(showSystemUi = true, showBackground = true)
@Composable
 fun RecordTransactionScreen() {

     var amount by remember { mutableStateOf("") }
    var note by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {

        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp)) {

            //First Row
            Text("Record Transaction",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)

            //Second Row
            Row(modifier = Modifier.fillMaxWidth().height(50.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {

                Card(modifier = Modifier.width(160.dp).fillMaxHeight(),
                    colors = CardDefaults.cardColors(
                        containerColor = AlerttinRed
                    )) {


                        Row(modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Remove,
                                contentDescription = "Minus Icon",
                                modifier = Modifier.size(20.dp).background(
                                    color = Color.White,
                                    shape = CircleShape
                                )
                                    .padding(2.dp)
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Text("Expense",
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = Color.White,
                                    fontSize = 16.sp
                                ))
                        }

                }

                Card(
                    modifier = Modifier.width(160.dp).fillMaxHeight(),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.LightGray
                    )
                ) {


                        Row(Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(20.dp).background(
                                    color = Color.White,
                                    shape = CircleShape
                                )
                                    .padding(2.dp)
                            )

                            Spacer(modifier = Modifier.width(10.dp))
                            Text("Income",
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = Color.DarkGray,
                                    fontSize = 16.sp
                                ))
                        }
                }
            }//Second Row End;

            //Third Row start

            OutlinedTextField(
                value = amount,
                onValueChange = {amount = it},
                modifier = Modifier.fillMaxWidth().height(60.dp),
                placeholder = {Text("$ 0.00",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ))},

                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    unfocusedBorderColor = Color.LightGray,
                    focusedBorderColor = Color.Gray,
                    unfocusedPlaceholderColor = Color.DarkGray
                ),
                shape = RoundedCornerShape(12.dp)
            ) // Third Row Completed


            //Fourth Row Started;

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Select Category",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Black
                    ))

                //Here the lazy Grid will go

                val categorySelect = listOf(
                    CategoryRecordTransaction(icon = R.drawable.food, name = "Food", bg = WarmOrange),
                    CategoryRecordTransaction(icon = R.drawable.home, name = "Home", bg = Color.Blue.copy(alpha = 0.8f)),
                    CategoryRecordTransaction(icon = R.drawable.transport, name = "Transport", bg = Cyan),
                    CategoryRecordTransaction(icon = R.drawable.entertainment, name = "Entertainment", bg = ElectricPurple),
                    CategoryRecordTransaction(icon = R.drawable.shopping, name = "Shopping", bg = AlerttinRed),
                    CategoryRecordTransaction(icon = R.drawable.health, name = "Health", bg = GreenCard),
                    CategoryRecordTransaction(icon = R.drawable.bills, name = "Bill", bg = ActionBlue),
                    CategoryRecordTransaction(icon = R.drawable.eduction, name = "Education", bg = ElectricPurple.copy(0.8f)),
                    CategoryRecordTransaction(icon = R.drawable.other, name = "Other", bg = Color.LightGray)
                )


                LazyColumn(modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {

                    items(categorySelect.chunked(3))
                    {
                        rowItem ->

                        Row(modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically) {

                            rowItem.forEach { Item->

                            CategorySelectCard(Item)
                            }
                        }
                    }
                }



            }//Fourth Row Ended;

            Column(modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Notes",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                            color = Color.Black
                        ))

                    Text("(Optional)",
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontSize = 12.sp,
                            color = Color.DarkGray
                        ),
                        modifier = Modifier.padding(start = 2.dp))
                }

                OutlinedTextField(
                    value = note,
                    onValueChange = {note = it},
                    label = {Text("Add a note...",
                        fontSize = 16.sp,
                        color = Color.DarkGray)},
                    modifier = Modifier.fillMaxWidth().height(60.dp),
                    shape = RoundedCornerShape(12.dp)
                )

                Button(onClick = {},
                    modifier = Modifier.fillMaxWidth().height(60.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.DarkGray
                    ),
                    enabled = !note.isEmpty()) {
                    Text("Save Transaction",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontSize = 16.sp
                        ))
                }
            }


        }
    }
}