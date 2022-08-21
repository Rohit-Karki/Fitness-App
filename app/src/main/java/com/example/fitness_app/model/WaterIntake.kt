package com.example.fitness_app.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName="waterintake")
data class WaterIntake (
    @PrimaryKey(autoGenerate = true)
    val uid: Int=0,
    @ColumnInfo(name = "value") val value: Long,
    @ColumnInfo(name= "date") val date: String
    )