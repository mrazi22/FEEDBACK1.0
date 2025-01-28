package com.example.myapplicationfeedback.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplicationfeedback.R
import com.example.myapplicationfeedback.ui.theme.poppinsFontFamily








@Composable
fun RegisterImageComponent() {
    //image
    Image(
        painter = painterResource(id = R.drawable.register),
        contentDescription = "Login",
        modifier = Modifier.fillMaxWidth()
            .size(200.dp)




    )
}


@Composable
fun UsernameTextComponent( labelValue: String ){
    val textValue = remember { mutableStateOf("") }

    //outlined textfield
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        label = { Text(text = labelValue) },
        modifier = Modifier.fillMaxWidth(),

        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

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
@Composable
fun EmailTextComponent( labelValue: String ) {
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


    @Composable
    fun PasswordTextField( labelValue: String ) {
        val password = remember { mutableStateOf("") }

        val passwordVisible = remember { mutableStateOf(false) }

        val icon = if (passwordVisible.value) {
            Icons.Filled.Visibility
        } else {
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

            visualTransformation = if (passwordVisible.value) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
        )





    }
@Composable
fun ConfirmPassword(labelValue: String) {
    val passworda = remember { mutableStateOf("") }

    val passwordVisiblea = remember { mutableStateOf(false) }

    val icon = if (passwordVisiblea.value) {
        Icons.Filled.Visibility
    } else {
        Icons.Filled.VisibilityOff

    }

    OutlinedTextField(
        value = passworda.value,
        onValueChange = { passworda.value = it },
        label = { Text(text = labelValue) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Password") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),


        textStyle = androidx.compose.ui.text.TextStyle(color = androidx.compose.ui.graphics.Color.Black),


        trailingIcon = {
            IconButton(onClick = { passwordVisiblea.value = !passwordVisiblea.value }) {
                Icon(imageVector = icon, contentDescription = "Visibility")
            }
        },
        singleLine = true,
        maxLines = 1,

        visualTransformation = if (passwordVisiblea.value) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
    )


}







    @Composable
    fun ButtonComponentRegister(value: String, navController: NavController) {
        Button(
            onClick = {
                // Handle button click
                navController.navigate(Screen.LoginScreen.route)



            },
            modifier = Modifier.fillMaxWidth()
                               .heightIn(48.dp),
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



    @Composable
    fun LinkTextComponent( navController: NavController ){
        TextButton(onClick = {
            navController.navigate(Screen.LoginScreen.route)

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Text(text = "Have an account? Login",
                fontFamily = poppinsFontFamily,
                color= colorResource(id = R.color.colorPrimary),
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
            )
        }
    }










