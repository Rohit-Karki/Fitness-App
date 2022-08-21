package com.example.fitness_app.database

import androidx.room.*
import com.example.fitness_app.model.WaterIntake
import kotlinx.coroutines.flow.StateFlow

@Dao
interface WaterIntakeDAO {

    @Query("SELECT * FROM waterIntake")
    suspend fun getAll(): StateFlow<List<WaterIntake>>

    @Query("UPDATE waterintake SET value = :value where date = :date")
    suspend fun updateWaterIntake(date:String,value: Long)

    @Query("SELECT EXISTS(SELECT * FROM waterintake WHERE date = :date)")
    fun isDateExist(date: String): Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWaterIntake(waterIntake: WaterIntake)

    @Query("SELECT * FROM waterintake WHERE date = :date")
    suspend fun getWaterIntake(date:String) : StateFlow<WaterIntake>


}