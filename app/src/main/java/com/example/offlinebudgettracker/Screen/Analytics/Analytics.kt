package com.example.offlinebudgettracker.Screen.Analytics

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.offlinebudgettracker.Model.DonutModel
import com.example.offlinebudgettracker.ui.theme.ActionBlue
import com.example.offlinebudgettracker.ui.theme.SoftViolet
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import com.example.offlinebudgettracker.uicomponent.BottonNavigationBar

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun Analytics() {

    Scaffold(
        topBar = {AnalyticsTopBar()},
        bottomBar = { BottonNavigationBar() }
    ) { innerPadding ->

        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding).padding(horizontal = 16.dp)
        ) {

            var DonutItem = listOf(
                DonutModel("food",337.50, WarmOrange),
                DonutModel("Rent",225.00, ActionBlue),
                DonutModel("Leisure", 187.50, SoftViolet),
            )

            //Donut PieChart
            DonetChart(DonutItem)

            //bottom card list
            BottomPart(DonutItem)



        }

    }
}