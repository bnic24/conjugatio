package com.nobodysapps.conjugatio.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nobodysapps.conjugatio.screens.start.startView

@Composable
fun setUpNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavDestination.START_VIEW.route) {
        composable(NavDestination.START_VIEW.route) { startView() }
    }
}

enum class NavDestination(val route: String) {
    START_VIEW("start")
}


