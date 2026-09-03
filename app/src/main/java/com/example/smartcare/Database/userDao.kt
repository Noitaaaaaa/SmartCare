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

    @Query("SELECT * FROM user")
    fun getAllUserInfo(): Flow<List<UserInfo>>

    @Query("SELECT * FROM user WHERE email = :email LIMIT 1")
    suspend fun getUserByEmail(email: String): UserInfo?


    @Query("SELECT * FROM user WHERE id = :id LIMIT 1")
    suspend fun getUserById(id: Int): UserInfo?


}