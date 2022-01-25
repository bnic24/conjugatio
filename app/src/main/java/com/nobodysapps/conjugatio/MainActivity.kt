package com.nobodysapps.conjugatio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nobodysapps.conjugatio.navigation.setUpNavigation
import com.nobodysapps.conjugatio.screens.start.StartFragment
import com.nobodysapps.conjugatio.screens.start.startView
import com.nobodysapps.conjugatio.ui.theme.ConjugatioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ConjugatioTheme {
                setUpNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ConjugatioTheme {
        setUpNavigation()
    }
}