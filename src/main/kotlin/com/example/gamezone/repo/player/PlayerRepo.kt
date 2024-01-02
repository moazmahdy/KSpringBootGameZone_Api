package com.example.gamezone.repo.player

import com.example.gamezone.models.PlayerModel
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepo : JpaRepository<PlayerModel, Long> {

    fun findByEmail(email: String): PlayerModel?
}