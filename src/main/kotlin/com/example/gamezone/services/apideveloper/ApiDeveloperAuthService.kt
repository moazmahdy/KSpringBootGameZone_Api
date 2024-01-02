package com.example.gamezone.services.apideveloper

import com.example.gamezone.models.ApiDeveloperModel
import com.example.gamezone.repo.apideveloper.auth.ApiDeveloperRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ApiDeveloperAuthService @Autowired constructor(
    private val apiDeveloperRepo: ApiDeveloperRepo
) {
    fun login(username: String): ApiDeveloperModel? {
        return apiDeveloperRepo.findByEmail(username)
    }
}