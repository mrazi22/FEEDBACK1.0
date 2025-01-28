package com.example.myapplicationfeedback.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplicationfeedback.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun BannerHomeComponent() {
    //banner image
    val images = listOf(
        R.drawable.coll

    )
    val pagerState = rememberPagerState(
        pageCount = images.size

    )

    Column(
        modifier =  Modifier.fillMaxSize().padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Box(modifier = Modifier.wrapContentSize()){
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.wrapContentSize()
            ) {
                currentPage ->
                Card(
                    modifier = Modifier.wrapContentSize()
                        .padding(26.dp),
                    elevation = CardDefaults.cardElevation(8.dp)

                ){
                    Image(
                        painter = painterResource(id = images[currentPage]),
                        contentDescription = "Banner Image",
                    )


                }

            }

        }
        Spacer( modifier = Modifier.padding(10.dp))
        TextHomeComponent( navHostController = NavHostController(context = androidx.compose.ui.platform.LocalContext.current))
    }




}

@Composable
fun TextHomeComponent(
    navHostController: NavHostController

) {

    Column(
        modifier = Modifier.fillMaxSize().background(color = androidx.compose.ui.graphics.Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome to Feddie..How is the journey?",
            modifier = Modifier.padding(16.dp),
            style = androidx.compose.material3.MaterialTheme.typography.headlineSmall,
            color = androidx.compose.ui.graphics.Color.Black,
            textAlign = TextAlign.Center


        )

        Text(
            text = "Here at Feddie we believe the best way through a problem is through a " +
                    "problem and we cant wait to hear all the problemes you have faced so far" +
                    "on this academic journey you have chosen to pursue with us and we are " +"" +
                    "Thank you in advance for your participation and we hope to see you soon",
            modifier = Modifier.padding(16.dp),
            style = androidx.compose.material3.MaterialTheme.typography.bodyMedium,
            color = androidx.compose.ui.graphics.Color.Black,


        )




        Button(
            onClick = {
                navHostController.navigate("LeaveAfeedback")


            },
            modifier = Modifier.padding(end = 50.dp),


        ){
            Text(text = "Get Started")
            //icon point right

        }


    }
}
