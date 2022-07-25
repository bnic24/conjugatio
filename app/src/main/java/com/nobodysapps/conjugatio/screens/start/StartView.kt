package com.nobodysapps.conjugatio.screens.start

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nobodysapps.conjugatio.navigation.NavDestination
import com.nobodysapps.conjugatio.navigation.setUpNavigation
import com.nobodysapps.conjugatio.ui.theme.ConjugatioTheme

//@Preview(showBackground = true)
@Composable
fun StartView(
    viewModel: StartViewModel,
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
    ) {
        Text(
            text = "Start Screen",
            modifier = Modifier
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(NavDestination.SELECTION_VIEW.route)
            }
        ) {
            Text(
                text = "To Selection Screen"
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navController.navigate(NavDestination.PRACTICE_VIEW.route)
            }
        ) {
            Text(
                text = "To Practice Screen"
            )
        }
    }
}