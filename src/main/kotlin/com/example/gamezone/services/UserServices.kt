package com.example.gamezone.services

import com.example.gamezone.models.ApiDeveloperModel
import com.example.gamezone.models.GameDeveloperModel
import com.example.gamezone.models.PlayerModel
import com.example.gamezone.models.UserType
import com.example.gamezone.repo.apideveloper.auth.ApiDeveloperRepo
import com.example.gamezone.repo.gamedeveloper.auth.GameDeveloperRepo
import com.example.gamezone.repo.player.PlayerRepo
import com.example.gamezone.utils.errorResponse
import com.example.gamezone.utils.successResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserServices @Autowired constructor(
    private val apiDeveloperRepo: ApiDeveloperRepo,
    private val gameDeveloperRepo: GameDeveloperRepo,
    private val playerRepo: PlayerRepo
) {

    @Transactional
    fun register(
        userType: UserType,
        userName: String,
        email: String,
        password: String
    ): Any {

        try {
            when(userType) {

                UserType.API_DEVELOPER -> {
                    val apiDeveloperModel = ApiDeveloperModel(
                        userName = userName,
                        email = email,
                        password = password
                    )
                    apiDeveloperRepo.save(apiDeveloperModel)
                }

                UserType.PLAYER -> {
                    val playerModel = PlayerModel(
                        userName = userName,
                        email = email,
                        password = password
                    )
                    playerRepo.save(playerModel)
                }

                UserType.GAME_DEVELOPER -> {
                    val gameDeveloperModel = GameDeveloperModel(
                        userName = userName,
                        email = email,
                        password = password
                    )
                    gameDeveloperRepo.save(gameDeveloperModel)
                }
            }

            return successResponse("Registration successful")

        } catch (e: Exception) {
            return errorResponse<Any>("Registration failed: ${e.message}", HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}