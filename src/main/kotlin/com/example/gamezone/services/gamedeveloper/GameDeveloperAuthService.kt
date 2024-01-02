package com.example.gamezone.services.gamedeveloper

import com.example.gamezone.models.GameDeveloperModel
import com.example.gamezone.repo.gamedeveloper.auth.GameDeveloperRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GameDeveloperAuthService @Autowired constructor(
    private val gameDeveloperRepo: GameDeveloperRepo
) {
    fun login(email: String): GameDeveloperModel? {
        return gameDeveloperRepo.findByEmail(email)
    }
}