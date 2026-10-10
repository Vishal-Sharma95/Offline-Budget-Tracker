package com.example.offlinebudgettracker.Navigation

import kotlinx.serialization.Serializable

sealed class Routes(){

    @Serializable
    object Homescreen:Routes()


    @Serializable
    object Analytics: Routes()

    @Serializable
    object Budgetlimit: Routes()

    @Serializable
    object Transactionhistory: Routes()


}
