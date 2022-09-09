package com.example.fitness_app.composable

import android.app.Person
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.drawable.RippleDrawable
import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.sharp.*
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.util.TableInfo

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

      //  Column(horizontalAlignment = Alignment.Start) {

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





        /*Column(
          /*  Text(
                text = "Name",
                color = Color.Blue,
                textAlign = TextAlign.Left,
                fontSize = 20.sp,
                modifier = Modifier.fillMaxSize(),

                )   */

            {
                var name by remember { mutableStateOf("Name") }
                TextField(value = name, onValueChange = { newText -> name = newText })
            }
        ) */

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
                },
               /* trailingIcon = {
                    IconButton(onClick = {
                        Log.d("Check" , "Clicked")
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Check,
                            contentDescription = "Check Icon"
                        )
                    }
                }
                */

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
//                     //   modifier = Modifier.padding(20.dp),
                      //  fontSize = 50.sp,
                        text = "Next",
                        color = Color.White
                    )

                   /* Image(
                        imageVector = Icons.Sharp.ArrowForward,
                        contentDescription = null,

                        )   */


                }

            }

        }

    }
}



