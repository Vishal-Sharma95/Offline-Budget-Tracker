package com.example.offlinebudgettracker.Screen.Transactionhistory

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.offlinebudgettracker.Model.TransactionHistoryCardmodel
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.GreenCard
import com.example.offlinebudgettracker.ui.theme.SoftViolet
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import com.example.offlinebudgettracker.uicomponent.BottonNavigationBar
import java.time.LocalDate
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun TransactionHistory(navController: NavHostController) {

 val transactionHistorylist = remember {  mutableStateListOf (
         TransactionHistoryCardmodel(
          icon = R.drawable.food,
          color = WarmOrange,
          title = "Grocery Store",
          category = "Food",
          Paid = 85.40,
          time = LocalTime.of(10, 24),
          Date = LocalDate.now()
         ),

 TransactionHistoryCardmodel(
  icon = R.drawable.entertainment,
  color = SoftViolet,
  title = "Drama",
  category = "entertainment",
  Paid = 12.50,
  time = LocalTime.of(9, 15),
  Date = LocalDate.now()
 ),

 TransactionHistoryCardmodel(
  icon = R.drawable.salary,
  color = GreenCard,
  title = "Salary",
  category = "income",
  Paid = 3200.00,
  time = LocalTime.of(8, 0),
  Date = LocalDate.now()
 ),
 TransactionHistoryCardmodel(
  icon = R.drawable.entertainment,
  color = SoftViolet,
  title = "Movie",
  category = "entertainment",
  Paid = 24.99,
  time = LocalTime.of(7, 45),
  Date = LocalDate.of(2026, 10, 9)
 ),
 TransactionHistoryCardmodel(
  icon = R.drawable.food,
  color = WarmOrange,
  title = "Supermarket",
  category = "Food",
  Paid = 56.20,
  time = LocalTime.of(5, 32),
  Date = LocalDate.of(2026, 10, 9)
 ),
 TransactionHistoryCardmodel(
  icon = R.drawable.salary,
  color = GreenCard,
  title = "Salary",
  category = "income",
  Paid = 3200.00,
  time = LocalTime.of(10, 24),
  Date = LocalDate.of(2026, 10, 2)
 ),
 TransactionHistoryCardmodel(
  icon = R.drawable.food,
  color = WarmOrange,
  title = "Coffee",
  category = "Food",
  Paid = 4.50,
  time = LocalTime.of(9, 12),
  Date = LocalDate.of(2026, 10, 7)
 )
 ) }

 val Today = LocalDate.now()
 val Yesterday = Today.minusDays(1)

 val todayTransaction = transactionHistorylist.filter { it.Date == Today }
 val yesterdayTransaction = transactionHistorylist.filter { it.Date == Yesterday }
 val earlierTransaction = transactionHistorylist.filter { it.Date.isBefore(Yesterday) }


 Scaffold(
  topBar = { TransactionHistoryTopBar() },
  bottomBar = { BottonNavigationBar(navController,  "History") },
  modifier = Modifier.padding(horizontal = 16.dp)
 ) { innerPadding ->


  //********************Making Category Wise Transaction History***************************

  LazyColumn(
   modifier = Modifier.fillMaxWidth().padding(innerPadding),
   verticalArrangement = Arrangement.spacedBy(4.dp)
  ) {


   //Today Transaction
   if (todayTransaction.isNotEmpty()) {
    item {
     Text("Today", fontWeight = FontWeight.SemiBold)
    }

    items(
     items = todayTransaction,
     key = { item -> "${item.title}_${item.Date}_${item.time}_${item.Paid}" }
    ) { transaction ->
     TransactionSlideToDelete(
      transactionCard = transaction,
      onDelete = { transactionHistorylist.remove(transaction) }
     )
    }
   }



   //Yesterday Transaction
   if (yesterdayTransaction.isNotEmpty()) {
    item {
     Text("Yesterday", fontWeight = FontWeight.SemiBold)
    }

    items(
     items = yesterdayTransaction,
     key = { item -> "${item.title}_${item.Date}_${item.time}_${item.Paid}" }
    ) { transaction ->
     TransactionSlideToDelete(
      transactionCard = transaction,
      onDelete = { transactionHistorylist.remove(transaction) }
     )
    }
   }

   //Earlier Transaction
   if (earlierTransaction.isNotEmpty()) {

    item {
     Text("Earlier", fontWeight = FontWeight.SemiBold)
    }

    items(
     items = earlierTransaction,
     key = { item -> "${item.title}_${item.Date}_${item.time}_${item.Paid}" }
    ) { transaction ->
     TransactionSlideToDelete(
      transactionCard = transaction,
      onDelete = { transactionHistorylist.remove(transaction) }
     )
    }
   }


  }


 }
}