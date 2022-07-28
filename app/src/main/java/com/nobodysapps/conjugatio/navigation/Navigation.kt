package com.nobodysapps.conjugatio.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nobodysapps.conjugatio.screens.practice.PracticeView
import com.nobodysapps.conjugatio.screens.results.ResultsView
import com.nobodysapps.conjugatio.screens.selection.SelectionView
import com.nobodysapps.conjugatio.screens.start.StartView
import com.nobodysapps.conjugatio.screens.start.StartViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun setUpNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavDestination.START_VIEW.route) {
        composable(NavDestination.START_VIEW.route) { StartView(hiltViewModel(),  navController) }
        composable(NavDestination.PRACTICE_VIEW.route) { PracticeView(hiltViewModel(), navController) }
        composable(NavDestination.RESULTS_VIEW.route) { ResultsView(hiltViewModel(), navController) }
        composable(NavDestination.SELECTION_VIEW.route) { SelectionView(hiltViewModel(), navController) }
    }
}

enum class NavDestination(val route: String) {
    START_VIEW("start"),
    PRACTICE_VIEW("practice"),
    RESULTS_VIEW("results"),
    SELECTION_VIEW("selection"),
}


