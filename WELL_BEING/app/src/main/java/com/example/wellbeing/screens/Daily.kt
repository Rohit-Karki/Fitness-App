package com.example.wellbeing.screens

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape


import androidx.compose.material.Text
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.wellbeing.Exercise.ExerciseData
import com.example.wellbeing.ExerciseDataDetails
import com.example.wellbeing.ui.theme.*

//import com.example.wellbeing.Services.TrackingService
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

//import com.example.wellbeing.others.Constants


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DailyScreen(){
    val navHostController = rememberNavController()


    NavHost(
        navController = navHostController,
        startDestination = "exercise_data"
    ){
        composable("exercise_data"){
            Exercise(navController = navHostController)
        }
        composable("grid_detail/{item}",
            arguments = listOf(
                navArgument("item"){
                    type = NavType.StringType
                }
            )
        ){navBackStackEntry ->

            navBackStackEntry?.arguments?.getString("item")?.let { json->
                val item = Gson().fromJson(json,ExerciseData::class.java)
                ExerciseDataDetails(data = item)

            }
        }


    }


}
