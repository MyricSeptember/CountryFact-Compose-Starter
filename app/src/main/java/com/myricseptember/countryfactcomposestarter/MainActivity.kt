package com.myricseptember.countryfactcomposestarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.myricseptember.countryfactcomposestarter.screens.home.HomeScreen
import com.myricseptember.countryfactcomposestarter.ui.theme.CountryFactComposeStarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountriesApp {
                HomeScreen()
            }
        }
    }
}
@Composable
fun CountriesApp(content: @Composable () -> Unit) {
    CountryFactComposeStarterTheme() {
        content()
    }
}
@Preview(showBackground = true)
@Composable

fun DefaultPreview() {
    CountriesApp {
        HomeScreen()
    }
}