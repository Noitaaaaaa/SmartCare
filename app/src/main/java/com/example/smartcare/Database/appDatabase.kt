package com.example.smartcare.Database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [UserInfo::class],
    version = 1
)

abstract class AppDatabase: RoomDatabase(){

    abstract val userDao:userDao

}