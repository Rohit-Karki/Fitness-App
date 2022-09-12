package com.example.fitness_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.fitness_app.composable.DataForm
import com.example.fitness_app.ui.theme.Fitness_AppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.InternalCoroutinesApi

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Fitness_AppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    DataForm()
                }
            }
        }
    }
}

@InternalCoroutinesApi
@Composable
fun Greeting(name: String) {
    Text(text = "Hello Rohit!")
}


@InternalCoroutinesApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Fitness_AppTheme {
        Greeting("Android")
    }
}



