package com.example.myapplicationfeedback.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplicationfeedback.R
import com.example.myapplicationfeedback.screens.Screen
import com.example.myapplicationfeedback.ui.theme.poppinsFontFamily


@Composable
fun Imagecomponent( ){
    //image
    Image( painter = painterResource(id = R.drawable.login),
        contentDescription = "Login",
        modifier = Modifier.fillMaxWidth()
            .size(200.dp)


    )



}

//textfields
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField( labelValue: String ){
    val textValue = remember { mutableStateOf("") }


    //outlined textfield
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        label = { Text(text = labelValue) },
        modifier = Modifier.fillMaxWidth(),

        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),

        textStyle = androidx.compose.ui.text.TextStyle(color = androidx.compose.ui.graphics.Color.Black),

        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Person, // Use the desired filled icon
                contentDescription = "Profile" // Provide a content description
            )

        },
        //cursor color
        singleLine = true,
        maxLines = 1,



    )


}
//password
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField( labelValue: String ){
    val password = remember { mutableStateOf("") }

    val passwordVisible = remember { mutableStateOf(false) }

    val icon = if(passwordVisible.value){
        Icons.Filled.Visibility
    }else {
        Icons.Filled.VisibilityOff

    }

    OutlinedTextField(
        value = password.value,
        onValueChange = { password.value = it },
        label = { Text(text = labelValue) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Password") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),


        textStyle = androidx.compose.ui.text.TextStyle(color = androidx.compose.ui.graphics.Color.Black),


        trailingIcon = {
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(imageVector = icon, contentDescription = "Visibility")
            }
        },
        singleLine = true,
        maxLines = 1,

        visualTransformation =  if (passwordVisible.value) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
    )


}
@Composable
fun ForgotPassword(value: String, navController: NavController){


    Text(text = value,

        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp).clickable(
                //




            ){
                navController.navigate(Screen.ForgotPasswordScreen.route)



            }
           ,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.25.sp,
            fontStyle = FontStyle.Normal

        ),
        color = androidx.compose.ui.graphics.Color.Blue,
        textAlign = TextAlign.Right


    )
    //clickable text


}
@Composable
fun ButtonComponent(value: String, navController: NavController) {
    Button(
        onClick = {
            navController.navigate(Screen.HomeScreen.route)
        },
        modifier = Modifier.fillMaxWidth().heightIn(48.dp),
        // Apply to the outer
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp).background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            colorResource(id = R.color.colorPrimary),
                            colorResource(id = R.color.colorSecondary)


                        )
                    ),
                    shape = RoundedCornerShape(50.dp),
                    //align content in center


                )
        ) {
            Text(
                text = value,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

//or login with
@Composable
fun OrComponent(){
    Text(
        text = "Or ",
        modifier = Modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 20.dp),

        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.25.sp,
            fontStyle = FontStyle.Normal

        ),
        color = androidx.compose.ui.graphics.Color.Black,
        textAlign = TextAlign.Center
    )




}


@Composable
fun TextComponent(  navController: NavController){
    TextButton(onClick = {
        navController.navigate(Screen.RegisterScreen.route)

    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        Text(text = "Create an account",
            fontFamily = poppinsFontFamily,
            color= colorResource(id = R.color.colorPrimary),
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}
//material facebook and google icons
//@Composable
//fun IconComponent(){
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = Modifier.fillMaxWidth()
//    ){
//        Row(
//            modifier  =Modifier.wrapContentSize()
//
//
//
//
//            ){
//            Image(
//                painter = painterResource(id = R.drawable.facebook),
//                contentDescription = "Facebook",
//                modifier = Modifier.size(65.dp).clickable{
//                    //
//                }.padding(end = 30.dp).padding(bottom = 10.dp)
//            )
//            Image(
//                painter = painterResource(id = R.drawable.google),
//                contentDescription = "Google",
//                modifier = Modifier.size(50.dp).clickable{
//                    //
//                }
//            )
//
//        }
//
//    }








