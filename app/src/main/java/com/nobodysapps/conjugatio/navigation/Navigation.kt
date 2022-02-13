package com.nobodysapps.conjugatio.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nobodysapps.conjugatio.screens.practice.practiceView
import com.nobodysapps.conjugatio.screens.results.resultsView
import com.nobodysapps.conjugatio.screens.selection.selectionView
import com.nobodysapps.conjugatio.screens.start.StartViewModel
import com.nobodysapps.conjugatio.screens.start.startView

@Composable
fun setUpNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavDestination.START_VIEW.route) {
        composable(NavDestination.START_VIEW.route) { startView(viewModel(),  navController) }
        composable(NavDestination.PRACTICE_VIEW.route) { practiceView(viewModel(), navController) }
        composable(NavDestination.RESULTS_VIEW.route) { resultsView(viewModel(), navController) }
        composable(NavDestination.SELECTION_VIEW.route) { selectionView(viewModel(), navController) }
    }
}

enum class NavDestination(val route: String) {
    START_VIEW("start"),
    PRACTICE_VIEW("practice"),
    RESULTS_VIEW("results"),
    SELECTION_VIEW("selection"),
}


