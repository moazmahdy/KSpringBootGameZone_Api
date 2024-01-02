package com.example.gamezone.exaption.response

import org.springframework.http.HttpStatus

sealed class ApiResponse<T>(val message: String, val status: HttpStatus) {
    class Success<T>(val data: T) : ApiResponse<T>("Success", HttpStatus.OK)
    class Error<T>(message: String, status: HttpStatus) : ApiResponse<T>(message, status)
}