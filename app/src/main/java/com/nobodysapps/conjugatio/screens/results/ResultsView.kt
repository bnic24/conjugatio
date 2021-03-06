package com.nobodysapps.conjugatio.screens.results

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nobodysapps.conjugatio.navigation.NavDestination

@Composable
fun ResultsView(viewModel: ResultsViewModel, navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
    ) {
        Text(
            text = "Results Screen",
            modifier = Modifier
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(NavDestination.START_VIEW.route)
            }
        ) {
            Text(
                text = "To Start Screen"
            )
        }
    }
}
