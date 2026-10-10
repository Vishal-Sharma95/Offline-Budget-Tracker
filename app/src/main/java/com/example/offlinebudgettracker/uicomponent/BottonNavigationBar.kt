package com.example.offlinebudgettracker.uicomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.offlinebudgettracker.Navigation.Routes
import com.example.offlinebudgettracker.R
import com.example.offlinebudgettracker.ui.theme.WarmOrange
import kotlin.Int
import kotlin.String

@Composable
 fun BottonNavigationBar(navController: NavController, routeSelected: String) {

  val navItem = listOf(

   NavItem(icon = R.drawable.home, label = "Home", Routes.Homescreen),
   NavItem(icon = R.drawable.analytics, label = "Analytics", Routes.Analytics),
   NavItem(icon = R.drawable.budgeticon, label = "Budget", Routes.Budgetlimit),
   NavItem(icon = R.drawable.transactionhistory, label = "History", Routes.Transactionhistory)


  )

 NavigationBar(
  containerColor = Color.White,
  windowInsets = WindowInsets(0, 0, 0, 0),

          modifier = Modifier
   .background(color = Color.White)
 ) {
    navItem.forEach { item ->

     NavigationBarItem(
      onClick = {
       navController.navigate(item.route){
        popUpTo(navController.graph.startDestinationId ){
         saveState = true// save the state of screen;
        }
        launchSingleTop = true// keep only one in stack , in case of multiple click;
        restoreState = true // saveState save the state and restoreState restore the state of screen;

       }
      },
      icon = {
       Icon(
        painter = painterResource(item.icon),
        contentDescription = item.label,
        modifier = Modifier.size(22.dp)
       )
      },
      label = {
       Text(
        text = item.label,
        style = MaterialTheme.typography.titleLarge.copy(
         fontWeight = FontWeight.SemiBold,
         fontSize = 12.sp
        )
       )
      },
      selected =  item.label == routeSelected,
      colors = NavigationBarItemDefaults.colors(
       unselectedIconColor = Color.DarkGray.copy(0.8f),
       selectedIconColor = Color.Black,
       selectedTextColor = Color.Black,
       unselectedTextColor = Color.DarkGray.copy(0.8f),
       indicatorColor = Color.Gray.copy(0.5f)
      )
     )
    }
 }

}

data class NavItem(
 val icon : Int,
 val label : String,
 val route : Routes
 )


