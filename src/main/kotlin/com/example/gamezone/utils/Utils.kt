package com.example.gamezone.utils

import com.example.gamezone.exaption.response.ApiResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

fun isValidPassword(password: String): Boolean {
    return password.matches(Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@\$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$"))
}

fun isValidEmail(email: String): Boolean {
    return email.matches(Regex("^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"))
}

fun <T> errorResponse(message: String, status: HttpStatus): ResponseEntity<ApiResponse<T>> {
    return ResponseEntity(ApiResponse.Error(message, status), status)
}

fun <T> successResponse(data: T): ResponseEntity<ApiResponse<T>> {
    return ResponseEntity(ApiResponse.Success(data), HttpStatus.OK)
}

@Value("\${app.jwt.expiration-in-ms}")
var jwtExpirationInMs: Long = 86400000