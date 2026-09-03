package com.example.smartcare.Database

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class loginViewModel(application: Application): AndroidViewModel(application){
    var userInfo by mutableStateOf(UserInfo())
        private set
    var loginError by mutableStateOf<String?>(null)
        private set

    fun onEmailChange(value: String) {
        userInfo = userInfo.copy(email = value)
    }

    fun onPasswordChange(value: String) {
        userInfo = userInfo.copy(password = value)
    }



    fun login(onSuccess: (user: UserInfo) -> Unit){
        viewModelScope.launch {
            val db = DatabaseProvider.getDatabase(getApplication())
            val savedUser = db.userDao.getUserByEmail(userInfo.email)

            when {
                savedUser == null -> loginError = "no Account found using that email"
                savedUser.password != userInfo.password -> loginError = "Incorrect Password"
                else -> {
                    loginError = null
                    onSuccess(savedUser)
                }
            }


        }
    }
}