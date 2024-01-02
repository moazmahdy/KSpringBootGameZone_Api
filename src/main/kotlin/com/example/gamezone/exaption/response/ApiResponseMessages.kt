package com.example.gamezone.exaption.response

object ApiResponseMessages {
    const val USERNAME_REQUIRED = "Username is required"
    const val PASSWORD_REQUIRED = "Password is required"
    const val USER_TYPE_REQUIRED = "UserType is required"
    const val INVALID_PASSWORD_FORMAT =
        "Invalid password format (min 6 characters, at least 1 uppercase, 1 lowercase, 1 number)"
    const val EMAIL_REQUIRED = "Email is required"
    const val INVALID_EMAIL_FORMAT = "Invalid email format"
    const val USERNAME_ALREADY_EXISTS = "Username already exists"
    const val EMAIL_ALREADY_REGISTERED = "This email already registered"
    const val INTERNAL_SERVER_ERROR = "Internal Server Error"
    const val EMAIL_NOT_FOUND = "Email not found"
    const val INVALID_PASSWORD = "Invalid password"
    const val INCORRECT_EMAIL_OR_PASSWORD = "Incorrect email or password"
}