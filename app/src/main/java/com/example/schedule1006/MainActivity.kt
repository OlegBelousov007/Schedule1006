package com.example.schedule1006

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.schedule1006.ui.bottom_nav.LoginScreen
import com.example.schedule1006.ui.bottom_nav.MainScreen
import com.example.schedule1006.ui.theme.Schedule1006Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MainScreen()

            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "Login_screen"
            ) {
                composable("Login_screen") {
                    LoginScreen {
                        navController.navigate("screen_1")
                    }
                }
                composable("screen_1") {

                }
            }

        }
    }
}

