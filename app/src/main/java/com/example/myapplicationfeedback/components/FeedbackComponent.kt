package com.example.myapplicationfeedback.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun ExpandableComponent(
    navController: NavController = NavController(LocalContext.current)
){
    val expanded = remember { mutableStateOf(false) }
    val rotationState = animateFloatAsState(
        targetValue = if (expanded.value) 180f else 0f,
        animationSpec = tween(
            durationMillis = 300,
            easing = LinearOutSlowInEasing
        )
    )

    //card
    Card(
        onClick = {
            expanded.value = !expanded.value
        },
        shape =  MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth()
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
    ) {
        //column
        Column(
            modifier = Modifier.padding(16.dp).fillMaxWidth()

        ) {
            Row(
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically

            ){
                Text(
                    text = "How has the new system been working for you?",
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.weight(6.5f),
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight =  FontWeight.Bold,
                    //multiple lines
                    maxLines = if (expanded.value) Int.MAX_VALUE else 1,
                    overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis

                )
                IconButton(
                    onClick = { expanded.value = !expanded.value },
                    modifier = Modifier.weight(0.5f).alpha( if (expanded.value) 0f else 1f).rotate( rotationState.value)
                ) {
                    Icon(
                        imageVector = if (expanded.value) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = if (expanded.value) "Show less" else "Show more"

                    )
                }

            }
        }



    }
}



