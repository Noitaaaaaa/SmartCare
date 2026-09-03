package com.example.smartcare

import android.R.attr.value
import androidx.compose.runtime.Composable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat.enableEdgeToEdge
import com.example.smartcare.ui.theme.SmartCareTheme


@Composable
fun Login() {

Column(modifier = Modifier.fillMaxSize()
    .padding(16.dp))
{
    Spacer( modifier = Modifier.height(32.dp))

    Text(text = ("Login"), style = MaterialTheme.typography.headlineSmall)

    Spacer( modifier = Modifier.fillMaxSize()
        .padding(18.dp))

    OutlinedTextField(

    )

}

}
