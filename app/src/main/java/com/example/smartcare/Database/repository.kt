package com.example.smartcare.Database

import androidx.room.RoomDatabase

class Repository(private val db: AppDatabase){
    suspend fun upsertUser(userInfo: UserInfo){
        db.userDao.upsertUser(userInfo)
    }
    fun getAllUserInfo() = db.userDao.getAllUserInfo()
}