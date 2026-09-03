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

    fun login(onSuccess: (userInfo: UserInfo) -> Unit){
        viewModelScope.launch {
            val db = DatabaseProvider.getDatabase(getApplication())


        }
    }
}