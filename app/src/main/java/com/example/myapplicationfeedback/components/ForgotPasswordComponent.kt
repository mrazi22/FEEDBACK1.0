package com.example.myapplicationfeedback.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationfeedback.R
import com.example.myapplicationfeedback.ui.theme.poppinsFontFamily
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.TextButton

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import com.example.myapplicationfeedback.screens.Screen


@Composable
fun ForgotTextComponent(){
    Text(
        text = "FORGOT YOUR PASSWORD",
        fontFamily = poppinsFontFamily,
        color = androidx.compose.ui.graphics.Color.Black,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp





    )


}
@Composable
fun ForgotImageComponent(){
    Image(
        painter = painterResource(id = R.drawable.forgot),
        contentDescription = "Forgot",
        modifier = Modifier
            .fillMaxWidth()
            .size(200.dp)
            .background(Color.White)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotBodyComponent(){

   //email varriable
    val email = remember { mutableStateOf("") }


    //card

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        //white color
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp)



    ){
        Column(
            modifier = Modifier
                .padding(vertical = 20.dp)
        ){
            Text(
                text = "Please enter your email address. You will receive a link to create a new password via email.",
                fontFamily = poppinsFontFamily,
                color = androidx.compose.ui.graphics.Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 15.sp



                )


            OutlinedTextField(
                value = email.value,
                onValueChange = { email.value = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
                    .padding(horizontal = 20.dp),
                label =  {
                    Text(
                        text = "Email",
                        fontFamily = poppinsFontFamily,
                    )

                },
                placeholder = {
                    Text(
                        text = "Enter your email",
                        fontSize = 12.sp,
                        color = androidx.compose.ui.graphics.Color.Gray,
                    )

                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email",
                        tint = colorResource(id = R.color.colorText)

                    )
                },
                trailingIcon = {
                    if (email.value.isNotEmpty()) {
                        IconButton(onClick = { email.value = "" }) {
                            Icon(
                                imageVector = Icons.Filled.Clear,
                                contentDescription = "Clear",
                            )
                        }
                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

                singleLine =  true,

                //error message








                )
            //button
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
                    .padding(horizontal = 20.dp)
                    ,
                contentPadding = PaddingValues(vertical = 14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.colorPrimary),
                    contentColor = Color.White
                ),
                shape = Shapes().medium



            ) {
                Text(
                    text = "Send Reset Link",

                    fontFamily = poppinsFontFamily,
                    color = Color.White ,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }








        }

    }




}
@Composable
fun LinkTextComponent( navController: NavController){
    TextButton(onClick = {
        navController.navigate(Screen.LoginScreen.route)
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        Text(text = "Remember password? Login",
            fontFamily = poppinsFontFamily,
            color= colorResource(id = R.color.colorPrimary),
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}