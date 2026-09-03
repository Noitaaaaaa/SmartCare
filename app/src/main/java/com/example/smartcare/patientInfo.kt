package com.example.smartcare

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "patient")
data class patientInfo(
    @PrimaryKey ( autoGenerate = true)
    val id: Int,
    val firstNameOfPatient: String = "",
    val lastNameOfPatient: String = "",
    val emailOfPatient: String = "",
    val numOfPatient: String = "",

)