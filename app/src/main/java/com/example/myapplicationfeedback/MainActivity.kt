package com.example.myapplicationfeedback

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplicationfeedback.screens.SetupNavGraph
import com.example.myapplicationfeedback.screens.UserHome


class MainActivity : ComponentActivity() {

    lateinit var  navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            //SCAFFOLDING

            navController = rememberNavController()
           SetupNavGraph(navController = navController)






        }
    }
}

