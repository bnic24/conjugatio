package com.nobodysapps.conjugatio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nobodysapps.conjugatio.navigation.setUpNavigation
import com.nobodysapps.conjugatio.ui.theme.ConjugatioTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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