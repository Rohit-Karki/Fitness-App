package com.example.fitness_app.di.module

import android.content.Context
import androidx.room.Room
import com.example.fitness_app.database.WaterIntakeDAO
import com.example.fitness_app.database.WaterIntakeDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


<<<<<<< HEAD
@Module
@InstallIn(SingletonComponent::class)
object FitnessDatabaseModule {
=======
@InstallIn(SingletonComponent::class)
@Module
object FitnessDatabaseModule {

    @Singleton
    @Provides
    fun provideWaterIntakeDAO (database: WaterIntakeDatabase): WaterIntakeDAO {
        return database.getWaterIntakeDao()
    }
>>>>>>> 7ebc43c0cba6a084bb4902b0c204808aa4af309c

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context) :WaterIntakeDatabase {
        return Room
            .databaseBuilder(
                appContext,
                WaterIntakeDatabase::class.java,
                "FitnessApp").
            build()
    }

    @Singleton
    @Provides
    fun provideWaterIntakeDAO(database: WaterIntakeDatabase) :WaterIntakeDAO{
        return database.getWaterIntakeDao()
    }
}