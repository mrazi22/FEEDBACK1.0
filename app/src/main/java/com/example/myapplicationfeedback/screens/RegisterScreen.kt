package com.example.myapplicationfeedback.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplicationfeedback.components.ButtonComponent
import com.example.myapplicationfeedback.components.PasswordTextField


@Composable
fun Register(
    navController: NavController
){
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Column {
            RegisterImageComponent()
            UsernameTextComponent(labelValue = "Username")
            Spacer(modifier = Modifier.padding(10.dp))
            EmailTextComponent(labelValue = "Email")
            Spacer(modifier = Modifier.padding(10.dp))
            PasswordTextField(labelValue = "Password")
            Spacer(modifier = Modifier.padding(10.dp))
            ConfirmPassword(labelValue = "Confirm Password")
            Spacer(modifier = Modifier.padding(10.dp))
            ButtonComponentRegister(value = "Register", navController = navController)
            Spacer(modifier = Modifier.padding(10.dp))
            LinkTextComponent( navController = navController )

        }
    }
}