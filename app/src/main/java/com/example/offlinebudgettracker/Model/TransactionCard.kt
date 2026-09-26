package com.example.offlinebudgettracker.Model

import androidx.compose.ui.graphics.Color

//For Recent Transaction parameter;
data class TransactionCard(
    val icon:Int,
    val technicolor : Color,
    val Item : String,
    val description: String,
    val amount : Double


)
