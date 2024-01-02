package com.example.gamezone.models

import com.example.gamezone.utils.PasswordEncoder
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Api_Developer")
data class ApiDeveloperModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "username")
    var userName: String = "",

    @Column(updatable = true, name = "Password")
    var password: String = "",

    @Column(unique = true, updatable = true, name = "email")
    var email: String = "",

    @Column(updatable = true, name = "api_key")
    var apiKey: String = "",

    @Column(updatable = true, name = "hasApiKey")
    var hasApiKey: Boolean = false,

    @ElementCollection(targetClass = UserType::class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "developer_roles", joinColumns = [JoinColumn(name = "developer_id")])
    var roles: Set<UserType> = emptySet(),

    @Column(updatable = true, name = "lastAccess")
    var lastAccess: LocalDateTime? = null,

    @Column(name = "created_at", updatable = false)
    var createdAt: LocalDateTime? = null,

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null

) {
    fun matchPassword(password: String): Boolean {
        return PasswordEncoder.passwordEncoder.matches(password, this.password)
    }
}