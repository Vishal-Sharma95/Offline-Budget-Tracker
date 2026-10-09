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
import com.example.offlinebudgettracker.R
import kotlin.Int
import kotlin.String

@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun BottonNavigationBar() {

  val navItem = listOf(

   NavItem(icon = R.drawable.home, label = "Home"),
   NavItem(icon = R.drawable.analytics, label = "Analytics"),
   NavItem(icon = R.drawable.budgeticon, label = "Budget"),
   NavItem(icon = R.drawable.historyicon, label = "History")


  )

 NavigationBar(
  containerColor = Color.White,
  modifier = Modifier.height(70.dp).background(color = Color.White)
   .padding(top = 8.dp),
  windowInsets = WindowInsets(0.dp),
 ) {
    navItem.forEach { item ->

     NavigationBarItem(
      onClick = {},
      icon = {
       Icon(
        painter = painterResource(item.icon),
        contentDescription = item.label,
        modifier = Modifier.size(24.dp)
       )
      },
      label = {
       Text(
        text = item.label,
        style = MaterialTheme.typography.titleLarge.copy(
         fontWeight = FontWeight.Bold,
         fontSize = 12.sp
        )
       )
      },
      selected = false,
      colors = NavigationBarItemDefaults.colors(
       unselectedIconColor = Color.DarkGray.copy(0.8f),
       selectedIconColor = Color.Blue.copy(alpha = 0.5f),
       selectedTextColor = Color.Blue.copy(alpha = 0.5f),
       unselectedTextColor = Color.DarkGray.copy(0.8f)
      )
     )
    }
 }

}

data class NavItem(
 val icon : Int,
 val label : String
 )


