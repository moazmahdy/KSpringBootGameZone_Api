package com.example.gamezone.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

object PasswordEncoder {
    val passwordEncoder = BCryptPasswordEncoder()
}