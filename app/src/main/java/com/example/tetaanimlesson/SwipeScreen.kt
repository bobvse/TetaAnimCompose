package com.example.tetaanimlesson

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SwipeScreen (){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        val isSwitched = remember { mutableStateOf(false) }

        MySwitch(
            switchRadius = 22.dp,
            switchPadding = 4.dp,
            titleText = "Order 1000 rub",
            subtitleText = "Swipe to confirm",
            onCheckedChanged = {
                isSwitched.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
        )
    }
}