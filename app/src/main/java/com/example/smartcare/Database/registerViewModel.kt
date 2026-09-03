package com.example.smartcare.Database

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel


class RegisterViewModel(application: Application): AndroidViewModel(application){

    var userInfo by mutableStateOf(UserInfo())
        private set

    var Registererror by mutableStateOf<String?>(null)
        private set


}