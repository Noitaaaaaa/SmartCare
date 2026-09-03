package com.example.smartcare

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun Profile() {

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(18.dp)
    ){

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = ("Profile"))

        Spacer(modifier = Modifier.height(32.dp))

    }


}