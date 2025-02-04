package com.example.myapplicationfeedback.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplicationfeedback.components.DrawerComponent


@Composable
fun feedHistory( navController: NavController){

    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxWidth()
            .fillMaxSize()





    ) {
        Column {
            DrawerComponent( navController = navController)












        }
    }
}