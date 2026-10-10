package com.example.offlinebudgettracker.Screen.Budgetlimit

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.offlinebudgettracker.Model.BudgetLimitmodel
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.GreenCard
import com.example.offlinebudgettracker.ui.theme.SoftViolet
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import com.example.offlinebudgettracker.uicomponent.BottonNavigationBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
 fun BudgetLimits(navController: NavHostController) {

     //list of BudgetLimitModel:

     val budgetLimitlist = listOf(
         BudgetLimitmodel(icon = R.drawable.food, contentColor = WarmOrange, totalLimit = 400.00, totalSpent = 320.0, name = "Food"),
         BudgetLimitmodel(icon = R.drawable.home, contentColor = GreenCard, totalLimit = 1500.00, totalSpent = 550.0, name = "Rent"),
         BudgetLimitmodel(icon = R.drawable.entertainment, contentColor = SoftViolet, totalLimit = 200.00, totalSpent = 200.0, name = "Leisure")
     )
    Scaffold(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        topBar = {BudgetTopbar()},
        bottomBar = {BottonNavigationBar(navController, "Budget")}
    ) { innerPadding ->

        LazyColumn(modifier = Modifier.fillMaxWidth()
            .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(12.dp)) {

            budgetLimitlist.forEach { budgetItem->

            item {

                BudgetlimitCard(budgetLimitlist = budgetItem)

            }

            }
        }
    }
}