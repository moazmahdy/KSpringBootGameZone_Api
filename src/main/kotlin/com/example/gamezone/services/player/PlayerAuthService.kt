package com.example.gamezone.services.player

import com.example.gamezone.models.PlayerModel
import com.example.gamezone.repo.player.PlayerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PlayerAuthService @Autowired constructor(
    private val playerRepo: PlayerRepo
) {
    fun login(username: String): PlayerModel? {
        return playerRepo.findByEmail(username)
    }
}