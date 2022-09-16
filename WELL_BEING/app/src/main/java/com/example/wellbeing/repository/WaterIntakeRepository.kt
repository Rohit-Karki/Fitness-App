package com.example.wellbeing.repository
//
//import com.example.wellbeing.database.WaterIntakeDAO
//import com.example.wellbeing.model.WaterIntake
//import kotlinx.coroutines.flow.StateFlow
//import javax.inject.Inject
//
//class WaterIntakeRepository @Inject constructor(private val waterIntakeDAO: WaterIntakeDAO){
//
//    suspend fun getWaterIntake(date:String): StateFlow<WaterIntake> {
//        if(waterIntakeDAO.isDateExist(date)) {
//            waterIntakeDAO.insertWaterIntake(waterIntake = WaterIntake(0,0,date))
//        }
//        return waterIntakeDAO.getWaterIntake(date)
//
//    }
//    suspend fun updateWaterIntake(waterIntake: WaterIntake){
//        if(!waterIntakeDAO.isDateExist(waterIntake.date)) {
//            waterIntakeDAO.insertWaterIntake(waterIntake = waterIntake)
//        }
//        else {
//            waterIntakeDAO.updateWaterIntake(waterIntake.date, waterIntake.value)
//        }
//
//    }
//
//}