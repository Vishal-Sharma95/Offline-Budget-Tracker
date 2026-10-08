package com.example.offlinebudgettracker.Model

import androidx.compose.ui.graphics.Color

data class BudgetLimitmodel(
    val icon: Int,
    val contentColor: Color,
    val totalLimit: Double,
    val totalSpent: Double,
    val name: String
)
