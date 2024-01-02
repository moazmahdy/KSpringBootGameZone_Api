package com.example.gamezone.repo.apideveloper.auth

import com.example.gamezone.models.ApiDeveloperModel
import org.springframework.data.jpa.repository.JpaRepository

interface ApiDeveloperRepo : JpaRepository<ApiDeveloperModel, Long> {

    fun findByEmail(email: String): ApiDeveloperModel?
}