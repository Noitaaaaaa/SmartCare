package com.example.smartcare.Database

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.lifecycle.asLiveData

class viewModel(private val repository: Repository): ViewModel() {
    fun getAllUserInfo() = repository.getAllUserInfo().asLiveData(viewModelScope.coroutineContext)
    fun upsert(userInfo: UserInfo){
        viewModelScope.launch {
        repository.upsertUser(userInfo)
        }
    }
}

