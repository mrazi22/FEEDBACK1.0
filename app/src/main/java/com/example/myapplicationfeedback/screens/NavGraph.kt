package com.example.myapplicationfeedback.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(
     navController: NavHostController // Add NavController as a parameter
) {
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ){
        composable(
            route = Screen.LoginScreen.route
        ){
            Login( navController )


        }
        composable(
            route = Screen.RegisterScreen.route
        ) {
            Register( navController)
        }
        composable(
            route = Screen.ForgotPasswordScreen.route
        ) {
            ForgotPassword( navController )
        }

        composable(
            route = Screen.LeaveAfeedback.route
        ) {
            LeaveAfeedback( navController )
        }
        composable(
            route = Screen.FeedHistory.route
        ) {
            feedHistory( navController )
        }
        composable(
            route = Screen.HomeScreen.route
        ) {
            UserHome(  navController)
        }


    }


}





