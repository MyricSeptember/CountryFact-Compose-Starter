package com.myricseptember.countryfactcomposestarter.screens.home

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.myricseptember.countryfactcomposestarter.data.CountryRepository.Companion.getAllCountries
import com.myricseptember.countryfactcomposestarter.data.model.Country
import com.myricseptember.countryfactcomposestarter.widgets.CountryRow

@Composable
fun HomeScreen() {
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color.Transparent, elevation =
            0.dp, modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(text = "Countries", fontWeight = FontWeight.Bold)
        }
    }) {
        val country = getAllCountries()
        MainContent(country)
    }
}

@Composable
fun MainContent(
    countryList: List<Country>
) {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = countryList) {

                CountryRow(country = it) { countryId ->

                    Toast.makeText(
                        context, countryId.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}