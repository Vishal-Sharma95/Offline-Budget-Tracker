package com.example.offlinebudgettracker

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.offlinebudgettracker.Navigation.NavGraph
import com.example.offlinebudgettracker.Screen.Transactionhistory.TransactionHistory
import com.example.offlinebudgettracker.ui.theme.OfflineBudgetTrackerTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OfflineBudgetTrackerTheme {
//                Analytics()
//                HomeScreen()

//                BudgetLimits()
                NavGraph();
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OfflineBudgetTrackerTheme {
        Greeting("Android")
    }
}