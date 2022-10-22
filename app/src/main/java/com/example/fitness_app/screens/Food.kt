package com.example.wellbeing.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Fastfood
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.wellbeing.color

@Composable
fun FoodScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
        //.background(color = "#161B21".color)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Outlined.Fastfood,
            contentDescription = "food",
            tint = "#F4A950".color
        )
        // Text to Display the current Screen
        Text(text = "Food", color = "#F96167".color)
    }
}