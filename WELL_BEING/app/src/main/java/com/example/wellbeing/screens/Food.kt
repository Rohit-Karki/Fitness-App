package com.example.wellbeing.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Fastfood
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wellbeing.color

@Preview
@Composable
fun FoodScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Card(
                elevation = 4.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(2.dp)
                    .background(color = Color.Cyan)) {
                    horizontalProgressBar()
                }
            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                elevation = 3.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(2.dp)
                    .background(color = Color.Cyan)
                ){
                    Text(text = "Breakfast",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Light,
                        fontSize =10.sp

                        )

                }


            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                elevation = 3.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(2.dp)
                    .background(color = Color.Cyan)
                ){
                    Text(text = "Lunch",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Light,
                        fontSize =10.sp

                    )

                }


            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                elevation = 3.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(2.dp)
                    .background(color = Color.White)
                ){
                    Text(text = "Dinner",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Light,
                        fontSize =10.sp

                    )

                }


            }

        }

    }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(
            elevation = 3.dp,
            shape = RoundedCornerShape(10.dp)
        ) {


        }

    }



}
@Composable
fun horizontalProgressBar(){
        Column(modifier = Modifier.padding(20.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "0 kcal", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                Column(verticalArrangement = Arrangement.Center) {
                    Text(text = "Your Goal")
                    Text(text = "2957 kcal", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
            LinearProgressIndicator(progress = 0.2f, modifier = Modifier
                .fillMaxWidth()
                .height(25.dp)
                .clip(RoundedCornerShape(15.dp)),
                backgroundColor = Color.LightGray,
                color = Color.Magenta) //progress color)
//            CircularProgressIndicator()
        }
}