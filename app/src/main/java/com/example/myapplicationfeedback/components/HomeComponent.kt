package com.example.myapplicationfeedback.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Feedback
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplicationfeedback.R
import com.example.myapplicationfeedback.screens.Screen
import kotlinx.coroutines.launch


@Composable
fun DrawerComponent(modifier: Modifier = Modifier, navHostController: NavController){
    //initial state
    val drawerState =
        rememberDrawerState(initialValue = DrawerValue.Closed)

    //scope of close and open drawer
    val scope = rememberCoroutineScope()

        //modal navigation drawer


   ModalNavigationDrawer(
       drawerState = drawerState,
       drawerContent = {
         ModalDrawerSheet {
             DrawerContent( scope, drawerState)

         }

       },
       content = {
           // Scaffold component open and close drawable
           Scaffold(
               topBar = { TopBar(
                   onOpenDrawer = {
                       scope.launch {
                           drawerState.apply{
                               if (isClosed) open() else close()
                           }
                       }
                   }
               ) },
               modifier = Modifier.background(Color.White)

           ){

               padding->
               ScreenContent( modifier = Modifier.padding(top = 60.dp))
           }



       },




   )



}
@Composable
fun DrawerContent( scope: Any, drawerState: Any, modifier: Modifier = Modifier) {

    Image(
        painter = painterResource(id = R.drawable.wave),
        contentDescription = "wave",
        modifier = Modifier
            .fillMaxWidth()
            .size(150.dp),
        //align center
        contentScale = ContentScale.Crop,


        )
    Text(
        text = "Welcome to Feddie",
        modifier = Modifier.padding(16.dp)
        ,
        style = MaterialTheme.typography.titleMedium.copy(fontSize = 20.sp),
        color = colorResource(id = R.color.skyBlue),
        textAlign = TextAlign.Center,



    )
    HorizontalDivider()

    Spacer(modifier = Modifier.padding(5.dp))


    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                modifier = Modifier.size(28.dp)


            )
        },
        label ={
            Text(
                text = "Home",
                fontSize = 15.sp,

                modifier = Modifier.padding(16.dp)
            )

        },
        selected = false,
        onClick = {


        },

        )

    NavigationDrawerItem(


        icon = {
            Icon(
                imageVector = Icons.Default.Feedback,
                contentDescription = "Account",
                modifier = Modifier.size(28.dp)
            )
        },
        label ={
            Text(
                text = "leave a feedback",
                fontSize = 15.sp,

                modifier = Modifier.padding(16.dp)

            )

        },
        selected = false,
        onClick = {


        },

    )

    NavigationDrawerItem(
        icon = {
            Icon(
                imageVector = Icons.Default.History,
                contentDescription = "History",
                modifier = Modifier.size(28.dp)
            )
        },
        label ={
            Text(
                text = "feedback history",
                fontSize = 15.sp,

                modifier = Modifier.padding(16.dp)
            )

        },
        selected = false,
        onClick = {


        },

        )



}

@Composable
fun ScreenContent(  modifier: Modifier = Modifier){
    BannerHomeComponent()




}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(

    onOpenDrawer: () -> Unit,
){
    var expanded = remember { mutableStateOf(false) }

    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorResource(R.color.skyBlue),

        ),
        //navigation icon
        navigationIcon = {
            Icon(

                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                modifier = Modifier
                    .clickable {
                        onOpenDrawer()
                    }
                    .padding(start = 16.dp, end = 8.dp)
                    .size(28.dp)

            )
        },


        title = { Text(text = "Home",
            style = MaterialTheme.typography.headlineSmall) },

        actions = {







            Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Account",
            modifier = Modifier
                .padding(end = 16.dp)
                .size(28.dp)
            )

            Box {
                IconButton(onClick = { expanded.value = true }) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Account",
                        modifier = Modifier.size(28.dp)
                    )
                }
                DropdownMenu(
                    expanded = expanded.value,
                    onDismissRequest = { expanded.value = false },

                ) {
                    DropdownMenuItem(
                        text = { Text("Log Out") },
                        onClick = { expanded.value = false },


                    )

                }
            }

        }
    )



}













