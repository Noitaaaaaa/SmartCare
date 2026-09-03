package com.example.smartcare

import android.R.attr.shape
import android.graphics.drawable.shapes.Shape
import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.smartcare.Database.loginViewModel
import com.example.smartcare.Database.viewModel

@Composable
fun Login(
    navController: NavController,
    viewModel: loginViewModel = viewModel()
){

    val userInfo = viewModel.userInfo
    val loginError = viewModel.loginError

    var name by rememberSaveable() { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(32.dp)
    ) {
        Spacer (modifier = Modifier.height(54.dp))
        Text(text = "Login", fontSize = 32.sp, fontWeight = FontWeight.W500, fontFamily = FontFamily.Default)

        Spacer (modifier = Modifier.height(32.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(25.dp),
            value = userInfo.email,
            onValueChange = { viewModel.onEmailChange(it) },
            label = { Text(text = "Enter Email")
            }

        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(25.dp),
            value = userInfo.password,
            onValueChange = {viewModel.onPasswordChange(it)},
            label = { Text( text = "Enter Password ")},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        Spacer(modifier =Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {

                navController.navigate("patientDashboard") //Kayo na bahala diyan

            }) {
                Text(text = "Login")

            }
            TextButton(
                onClick = {
                    navController.navigate("register")
                }
            ) {
                Text(text = "Register")
            }

        }

        Row(
            modifier =  Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
        TextButton(
            onClick = { navController.navigate("forgot") }
        ) {
            Text(text = "Forget password")


        }
}


    }


}