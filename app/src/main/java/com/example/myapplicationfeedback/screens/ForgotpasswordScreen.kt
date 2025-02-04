package com.example.myapplicationfeedback.screens

import androidx.compose.foundation.background
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplicationfeedback.components.ForgotBodyComponent
import com.example.myapplicationfeedback.components.ForgotImageComponent
import com.example.myapplicationfeedback.components.ForgotTextComponent
import com.example.myapplicationfeedback.components.LinkTextComponent


@Composable
fun ForgotPassword(
    navController: NavController
){
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
            .padding(28.dp)
            .background(Color.White)
            .fillMaxWidth()

    ) {

        //colum arrangment  and spacing the fields
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,



            ) {
            ForgotTextComponent()
            Spacer( modifier = Modifier.padding(10.dp))
            ForgotImageComponent()
            Spacer( modifier = Modifier.padding(10.dp))
            ForgotBodyComponent()
            Spacer( modifier = Modifier.padding(10.dp))
            LinkTextComponent( navController)








        }

    }
}

