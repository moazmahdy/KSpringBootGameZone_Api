package com.example.gamezone.models

import com.example.gamezone.utils.PasswordEncoder
import jakarta.persistence.*

@Entity
@Table(name = "Player")
data class PlayerModel (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(updatable = true, name = "user_name")
    var userName: String = "",

    @Column(unique = true, updatable = true, name = "Email")
    var email: String = "",

    @Column(updatable = true, name = "Password")
    var password: String = "",

    @Column(updatable = true, name = "Gender")
    var gender: String = "",

    @Column(updatable = true, name = "Age")
    var age: Int = 0
) {
    fun matchPassword(password: String): Boolean {
        return PasswordEncoder.passwordEncoder.matches(password, this.password)
    }
}