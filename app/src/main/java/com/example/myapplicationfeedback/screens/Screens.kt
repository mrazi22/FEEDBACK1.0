package com.example.myapplicationfeedback.screens

sealed class  Screen( val route: String) {

    object LoginScreen : Screen( "Login")
    object RegisterScreen : Screen( route = "Register")
    object ForgotPasswordScreen : Screen( route = "ForgotPassword")
    object HomeScreen : Screen( route = "Home")
    object LeaveAfeedback : Screen( route = "LeaveAfeedback")
    object FeedHistory : Screen( route = "FeedHistory")


}