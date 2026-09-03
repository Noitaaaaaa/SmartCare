package com.example.smartcare.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface userDao {
    @Upsert
    suspend fun upsertUser(userInfo: UserInfo)
    @Delete
    suspend fun deleteUser(userInfo: UserInfo)

    @Query("SELECT * FROM user")
    fun getAllUserInfo(): Flow<List<UserInfo>>
}