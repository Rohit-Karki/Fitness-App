package com.example.fitness_app.composable


import android.app.TimePickerDialog
import android.content.Context
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness_app.R
import java.util.*

@Preview (showBackground = true)
@Composable
fun DataForm() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(Cyan)
            .padding(10.dp)
    ) {

        val context = LocalContext.current
            Text(
                "Let's Get Started",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                color = Color.Black,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
                fontSize = 40.sp,
                )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center ,
            modifier = Modifier.fillMaxSize(),
        ) {
            var name by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = name,
                onValueChange = { newText -> name = newText },
                label = {Text ("Name")},
                shape = CircleShape ,
                modifier = Modifier.padding(5.dp),
                singleLine = true,
                leadingIcon = { Icon(
                    imageVector = Icons.Sharp.Person,
                    contentDescription = "Person Icon"
                )
                }
            )

            var age by remember {
                mutableStateOf<String>("")
            }

            OutlinedTextField(
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                placeholder = {},
                value = age,
                onValueChange = { newText -> age = newText },
                label = {Text ("Age")},
                shape = CircleShape,
                modifier = Modifier.padding(5.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Sharp.Face,
                        contentDescription = "Age"
                    )
                }
            )

            var mass by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                value = mass,
                onValueChange = { newText -> mass = newText },
                label = {Text ("Weight")},
                shape = CircleShape,
                modifier = Modifier.padding(5.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Sharp.Accessibility,
                        contentDescription = "Weight"
                    )
                }
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {Text ("Height")},
                shape = CircleShape,
                modifier = Modifier.padding(5.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Sharp.ArrowUpward,
                        contentDescription = "Height"
                    )
                }

            )

            val calendar = Calendar.getInstance()
            val hour = calendar[Calendar.HOUR_OF_DAY]
            val minute = calendar[Calendar.MINUTE]




            val context = LocalContext.current

            val time = remember { mutableStateOf("")}
            val timePickerDialog = TimePickerDialog(
                context,
                {_,
                    hour: Int ,
                    minute : Int ->
                    time.value = "$hour:$minute"
                },
                , hour , minute, false
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {Text ("WakeUp Time")},
                shape = CircleShape,
                modifier = Modifier.padding(5.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Sharp.Alarm,
                        contentDescription = "WakeUp Time"
                    )
                },
                trailingIcon = {
                    Button(onClick = {timePickerDialog.show()},
                        colors = ButtonDefaults.buttonColors(backgroundColor = Blue),
                        shape = CircleShape,

                    ) {
                        Text(text = "Set")
                    }
                }
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {Text ("Sleeping Time")},
                shape = CircleShape,
                modifier = Modifier.padding(5.dp),
                singleLine = true,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Sharp.NightsStay,
                        contentDescription = "Height"
                    )
                }

            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(100.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Button(
                    onClick = { /*TODO*/ },

                    colors = ButtonDefaults.buttonColors(backgroundColor = Blue),
                    shape = CircleShape,
                    elevation =  ButtonDefaults.elevation(
                        defaultElevation = 10.dp,
                        pressedElevation = 15.dp,
                        disabledElevation = 0.dp,
                    )
                    ) {
                    Text(
                        text = "Next",
                        color = Color.White
                    )

                }

            }

        }

    }
}



