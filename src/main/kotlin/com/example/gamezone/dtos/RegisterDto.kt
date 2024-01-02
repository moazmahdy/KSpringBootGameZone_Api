package com.example.gamezone.dtos

import com.example.gamezone.models.UserType

data class RegisterDto (

    val username: String?,
    val password: String?,
    val email: String?,
    val userType: UserType?

)