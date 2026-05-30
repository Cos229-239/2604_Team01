package com.example.team01_application.jeremiahgeigenmiller

data class User(
    val id: Int = 0,
    val username: String = "",
    val email: String = "",
    val passwordHash: String = "",
    val dndVersion: String = "5th Edition",
    val recommendedClasses: Boolean = true,
    val friendsList: List<String> = emptyList(),
    val profilePicture: String = "",
    val bio: String = ""
)