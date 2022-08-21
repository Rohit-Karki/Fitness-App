package com.example.fitness_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fitness_app.ui.theme.Fitness_AppTheme
import com.example.fitness_app.viewmodel.ReminderViewModel
import kotlinx.coroutines.InternalCoroutinesApi


class MainActivity : ComponentActivity() {
    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Fitness_AppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Rohit")
                }
            }
        }
    }
}

@InternalCoroutinesApi
@Composable
fun Greeting(name: String) {
    val reminderViewModel: ReminderViewModel = viewModel()
    val waterIntakeValue = reminderViewModel.waterIntakeQuantity.collectAsState()

    Text(text = "Hello $waterIntakeValue!")
}

@InternalCoroutinesApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Fitness_AppTheme {
        Greeting("Android")
    }
}

