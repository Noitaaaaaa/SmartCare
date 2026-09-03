package com.example.smartcare

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable

fun Forgot(navController: NavController){

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(18.dp)

    ){
    Text(text = "Forgot Password", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(18.dp))

    }
}