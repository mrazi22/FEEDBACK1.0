package com.example.myapplicationfeedback.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplicationfeedback.components.ButtonComponent
import com.example.myapplicationfeedback.components.ForgotPassword

import com.example.myapplicationfeedback.components.Imagecomponent
import com.example.myapplicationfeedback.components.MyTextField
import com.example.myapplicationfeedback.components.OrComponent
import com.example.myapplicationfeedback.components.PasswordTextField
import com.example.myapplicationfeedback.components.TextComponent


@Composable
fun Login( navController: NavHostController){


    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
            .fillMaxWidth()

    ) {
        //colum arrangment  and spacing the fields
        Column(
            modifier = Modifier.fillMaxSize()
                .fillMaxWidth(),

        ) {
            Imagecomponent()
            Spacer( modifier = Modifier.padding(10.dp))
            MyTextField(labelValue = "Email")
            Spacer( modifier = Modifier.padding(10.dp))
            PasswordTextField(labelValue = "Password")
            Spacer( modifier = Modifier.padding(10.dp))
            ForgotPassword( value = "Forgot Password", navController)
            Spacer( modifier = Modifier.padding(10.dp))
            ButtonComponent(value = "Login", navController)
            Spacer( modifier = Modifier.padding(10.dp))
            OrComponent()
            Spacer( modifier = Modifier.padding(10.dp))
            TextComponent(  navController)






        }

    }
}

