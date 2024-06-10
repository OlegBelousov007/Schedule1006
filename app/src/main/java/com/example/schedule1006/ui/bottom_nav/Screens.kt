package com.example.schedule1006.ui.bottom_nav

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.schedule1006.R


@Composable
fun LoginScreen(onClick: () -> Unit) {
    var textLogin by remember { mutableStateOf("") }
    var textPassword by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Schedule for ATT",
                fontSize = 36.sp,
                color = Color(0xff0000ff),
                fontStyle = FontStyle.Italic)
        }

        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column( modifier = Modifier
                .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(
                    text = "Log in",
                    fontSize = 36.sp,
                    color = Color.Black
                )
                OutlinedTextField(
                    value = textLogin,
                    onValueChange = { textLogin = it },
                    label = { Text("Login") },
                    modifier = Modifier
                        .padding(10.dp),
                    shape = RoundedCornerShape(30.dp)
                )
                OutlinedTextField(
                    value = textPassword,
                    onValueChange = { textPassword = it },
                    label = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .padding(10.dp),
                    shape = RoundedCornerShape(30.dp)
                )
                Button(modifier = Modifier
                    .padding(10.dp)
                    .width(120.dp)
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(30.dp)),
                    colors = ButtonDefaults.buttonColors(Color(0xff0000ff)),
                    onClick = { onClick() }) {
                    Text(text = "GO", color = Color(0xffffffff))

                }
            }

        }
    }
}

@Composable
fun Screen1() {

}

@Composable
fun Screen2(){

}

@Composable
fun Screen3(){
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.photoprofile),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = "S-130306",
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.height(4.dp))

                Text(text = "Белоусов Олег")

                Spacer(modifier = Modifier.height(30.dp))

            }
        }
        Row(modifier = Modifier
            .padding(20.dp, 0.dp, 0.dp, 0.dp)
            .fillMaxWidth()
        ) {
            Text(text = "Должность: ")
        }
        Row(modifier = Modifier
            .padding(20.dp, 10.dp, 0.dp, 0.dp)
            .fillMaxWidth()
        ) {
            Text(text = "Группа: ")
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(500.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End
        ) {
            Button( modifier = Modifier
                .padding(10.dp)
                .height(45.dp),
                colors = ButtonDefaults.buttonColors(Color(0xff0000ff)),
                onClick = { /*TODO*/ }) {
                Text(text = "Exit")
            }
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}