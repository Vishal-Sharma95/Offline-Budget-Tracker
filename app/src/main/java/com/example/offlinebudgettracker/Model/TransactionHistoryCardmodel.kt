package com.example.offlinebudgettracker.Model

import androidx.compose.ui.graphics.Color
import java.time.LocalDate
import java.time.LocalTime

data class TransactionHistoryCardmodel(
    val icon: Int,
    val color: Color,
    val title: String,
    val category: String,
    val Paid: Double,
    val time: LocalTime,
    val Date: LocalDate
)
