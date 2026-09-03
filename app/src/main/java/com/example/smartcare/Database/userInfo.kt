package com.example.smartcare.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserInfo(
    @PrimaryKey( autoGenerate = true)
    val id: Int = 0,
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val contactNum: String = "",
    val role: String = "Patient",
    val password: String = "",

)