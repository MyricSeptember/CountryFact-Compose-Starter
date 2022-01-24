package com.myricseptember.countryfactcomposestarter.screens.detail

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen() {
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent, elevation = 0.dp) {
            Text(text = "Country Detail")
        }
    }) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Enter Movie title",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Population", fontWeight = FontWeight.Bold)
                Text(text = "Enter Movie Population here")
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Largest City", fontWeight = FontWeight.Bold)
                Text(text = "Enter Movie Largest City here")
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Capital City", fontWeight = FontWeight.Bold)
                Text(text = "Enter Movie Capital City here")
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Major Language", fontWeight = FontWeight.Bold)
                Text(text = "Enter Movie Major Language here")
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Major Religion", fontWeight = FontWeight.Bold)
                Text(text = "Enter Movie Major Religion here")
                Spacer(modifier = Modifier.height(6.dp))
                Text(text = "Monetary Unit", fontWeight = FontWeight.Bold)
                Text(text = "Enter Movie Monetary Unit here")
            }
        }
    }
}