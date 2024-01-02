package com.example.gamezone.repo.gamedeveloper.auth

import com.example.gamezone.models.GameDeveloperModel
import org.springframework.data.jpa.repository.JpaRepository

interface GameDeveloperRepo : JpaRepository<GameDeveloperModel, Long> {

    fun findByEmail(email: String): GameDeveloperModel?
}