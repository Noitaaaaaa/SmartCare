package com.example.smartcare

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable

fun Profile(navController: NavController) {


    Column(
        modifier = Modifier.fillMaxSize()
            .padding(18.dp)
    ){

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = ("Profile"))

        Spacer(modifier = Modifier.height(32.dp))

    }

    Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top,
    ){
        Text(text = "Profile",
            style = MaterialTheme.typography.headlineSmall,
            )

    Button(
        onClick = { }
    ){
Text(text = "Profile here please" )
    }

        Spacer(
            modifier = Modifier.fillMaxSize()
                .padding(18.dp)
        )

    }


}