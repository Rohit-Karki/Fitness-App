package com.example.wellbeing.screens

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.DirectionsWalk
import androidx.compose.material3.AssistChipDefaults.Height
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
//import com.example.wellbeing.Services.TrackingService
import com.example.wellbeing.ViewModel.MainViewModel
import com.example.wellbeing.color
import com.example.wellbeing.ui.theme.Poppins
import com.example.wellbeing.ui.theme.PrimaryColor
import com.example.wellbeing.ui.theme.PrimaryTextColor
import com.example.wellbeing.ui.theme.Shapes
import androidx.compose.material.Text as Text1

//import com.example.wellbeing.others.Constants

@Composable
fun StepScreen(){
    CardDemo()
    BmiUI()
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            //.background(color = "#161B21".color)
//        ,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Icon(
//            imageVector = Icons.Outlined.DirectionsWalk,
//            contentDescription = "step",
//            tint = "#F4A950".color
//        )
//        // Text to Display the current Screen
//        Text(text = "Step Count", color = "#F96167".color)
//    }
}

//fun sendCommandToService(action: String,mContext: Context) {
//    mContext.startService(Intent(mContext, TrackingService::class.java).also {
//        it.action = Constants.ACTION_START_OR_RESUME_SERVICE
//    })
//
//}

@Composable
fun CardDemo() {

    val mContext = LocalContext.current
    val viewModel = viewModel<MainViewModel>()
    val steps = viewModel.stepCount.value

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .size(300.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceEvenly) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Text1(
                        text = "$steps",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 100.sp
                    )
                    Button(

                        modifier = Modifier
                            .padding(0.dp)
                            .clip(Shapes.medium),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                        elevation =  ButtonDefaults.elevation(
                            defaultElevation = 3.dp,
                            pressedElevation = 5.dp,
                            disabledElevation = 0.dp),onClick = { /* Do something! */ }) {
                        Text1("Paused")

                    }
                }
                Spacer(Modifier.width(180.0.dp))
                OutlinedButton(
                    modifier = Modifier
                        .padding(0.dp)
                        .clip(Shapes.medium),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
                elevation =  ButtonDefaults.elevation(
                    defaultElevation = 3.dp,
                    pressedElevation = 5.dp,
                    disabledElevation = 0.dp),
                    onClick = {
//                        sendCommandToService(
//                            Constants.ACTION_START_OR_RESUME_SERVICE,
//                            mContext)
                    },

                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),

                ) {
                    Icon(
                        Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        tint = PrimaryColor
                    )
                }
            }

            Spacer(
                Modifier
                    .size(30.dp)
                    .fillMaxWidth(1f))

            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.padding(10.dp)) {
                Column(modifier = Modifier
                    .height(100.dp)
                    .width(90.dp)) {
                    Icon(
                        Icons.Default.LocationOn,
                        contentDescription = "Location",
                        tint = PrimaryColor,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text1(text = "1.5",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = Poppins,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text1(text = "Km",
                        fontSize = 9.sp,

                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
                Spacer(Modifier.size(20.dp))
                Column(modifier = Modifier
                    .height(100.dp)
                    .width(90.dp)) {
                    Icon(
                        Icons.Default.ArrowForward,
                        contentDescription = "Location",

                        tint = PrimaryColor,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text1(text = "150", fontSize = 18.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold
                        ,modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text1(text = "Calories",
                        fontSize = 9.sp,

                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
                Spacer(Modifier.size(10.dp))
                Column(modifier = Modifier
                    .height(100.dp)
                    .width(90.dp)) {
                    Icon(
                        Icons.Default.AccountBox,

                        contentDescription = "Location",
                        tint = PrimaryColor,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text1(text = "0h 19m",
                        fontFamily = Poppins,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                    Text1(text = "Walking Time",
                        fontSize = 9.sp,

                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally))
                }
            }
        }
    }
}

@Composable
fun BmiUI(){
    var height by remember{ mutableStateOf("")}
    var Weight by remember{
        mutableStateOf("")
    }
    var age by remember{
        mutableStateOf("")
    }

    var Bmi by remember { mutableStateOf("")}
    var Cal by remember { mutableStateOf("")}

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 340.dp),

        horizontalAlignment = Alignment.CenterHorizontally,) {

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = age, onValueChange = {age = getValidatedNumber(it)}
            ,
            label = {
                Text(text = "AGE",
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp)
//                .padding(top = 420.dp)
            ,
//    colors = TextFieldDefaults.outlinedTextFieldColors(
//        unfocusedBorderColor = PrimaryColor,
//        focusedBorderColor = PrimaryColor,
//        textColor = PrimaryColor
//    ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = height, onValueChange = {height = getValidatedNumber(it)}
            ,
            label = {
                Text(text = "HEIGHT",
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp)
                ,
//    colors = TextFieldDefaults.outlinedTextFieldColors(
//        unfocusedBorderColor = PrimaryColor,
//        focusedBorderColor = PrimaryColor,
//        textColor = PrimaryColor
//    ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            singleLine = true,
        )


        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = Weight, onValueChange = {Weight = getValidatedNumber(it)}
            ,
            label = {
                Text(text = "WEIGHT",
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 100.dp)
//                .padding(top = 420.dp)
            ,
//    colors = TextFieldDefaults.outlinedTextFieldColors(
//        unfocusedBorderColor = PrimaryColor,
//        focusedBorderColor = PrimaryColor,
//        textColor = PrimaryColor
//    ),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal
            ),
            singleLine = true,
        )

        Spacer(modifier = Modifier.height(10.dp))
        Button(
            modifier = Modifier
                .clip(Shapes.medium),
//                .padding(top = 510.dp)
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 3.dp,
                pressedElevation = 5.dp,
                disabledElevation = 0.dp
            ),


            onClick = {
                     Bmi = calculateBmi(height = height.toDouble(),Weight = Weight.toDouble())
                    Cal = calorie(height = height.toDouble(),Weight = Weight.toDouble(),age = age.toDouble())

            },
        ){
            Text(
                text = "Calculate", fontFamily = Poppins,
                color = PrimaryTextColor,
                modifier = Modifier.padding(0.dp),
                fontSize = 15.sp
            )
        }
        
        Spacer(modifier = Modifier.height(10.dp))


        if (Bmi.isNotBlank()){
            Text(text = Bmi)
        }

        if (Bmi.isNotBlank()){
            Text(text = Cal)
        }
    }



}


private fun calculateBmi(height:Double, Weight:Double):String{
    val BmiIndex = Weight/(height * height)
    return "BMI is $BmiIndex"
}

private fun calorie(height:Double, Weight:Double, age:Double):String{
    val kcal =  66 + (6.2 * Weight) + (12.7 * height) - (6.76 * age)

    return "Calorie Burn should be $kcal"
}

fun getValidatedNumber(text: String): String {
    // Start by filtering out unwanted characters like commas and multiple decimals
    val filteredChars = text.filterIndexed { index, c ->
        c in "0123456789" ||                      // Take all digits
                (c == '.' && text.indexOf('.') == index)  // Take only the first decimal
    }
    // Now we need to remove extra digits from the input
    return if(filteredChars.contains('.')) {
        val beforeDecimal = filteredChars.substringBefore('.')
        val afterDecimal = filteredChars.substringAfter('.')
        beforeDecimal.take(3) + "." + afterDecimal.take(2)    // If decimal is present, take first 3 digits before decimal and first 2 digits after decimal
    } else {
        filteredChars.take(3)                     // If there is no decimal, just take the first 3 digits
    }
}



