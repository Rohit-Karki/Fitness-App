package com.example.fitness_app.viewmodel

import androidx.compose.runtime.collectAsState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitness_app.model.State
import com.example.fitness_app.model.WaterIntake
import com.example.fitness_app.repository.WaterIntakeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject
import kotlinx.coroutines.flow.collect


@HiltViewModel
@InternalCoroutinesApi
class ReminderViewModel @Inject constructor(private val waterIntakeRepository: WaterIntakeRepository) : ViewModel(){

    private val _waterIntakeQuantity:MutableStateFlow<State<WaterIntake>> = MutableStateFlow(State.loading())
    val waterIntakeQuantity : StateFlow<State<WaterIntake>> = _waterIntakeQuantity.asStateFlow()
    private val date :String = Date().toString()

    init{
        refresh()
    }

    @InternalCoroutinesApi
    fun refresh(){
        viewModelScope.launch {
            waterIntakeRepository
                .getWaterIntake(date)
                .collect { state ->
                    _waterIntakeQuantity.value = State.Success(state)
                }

        }
    }

}