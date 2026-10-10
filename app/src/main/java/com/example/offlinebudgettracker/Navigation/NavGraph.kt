package com.example.offlinebudgettracker.Navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.offlinebudgettracker.Screen.Analytics.Analytics
import com.example.offlinebudgettracker.Screen.Budgetlimit.BudgetLimits
import com.example.offlinebudgettracker.Screen.Homescreen.HomeScreen
import com.example.offlinebudgettracker.Screen.Transactionhistory.TransactionHistory

@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
 fun NavGraph() {

     val navController = rememberNavController()
///making navigation Graph in NavHost Composable;
    NavHost(
        navController = navController,
        startDestination = Routes.Homescreen
    ) {

        composable<Routes.Homescreen>{
            HomeScreen(navController)
        }

        composable<Routes.Analytics>{
            Analytics(navController)
        }

        composable<Routes.Budgetlimit>{
            BudgetLimits(navController)
        }

        composable<Routes.Transactionhistory> {
            TransactionHistory(navController)
        }
    }
}