package com.team01.dndcreogen.profile
data class User(
    val id: Int = 0,
    val username: String = "",
    val email: String = "",
    val passwordHash: String = "",
    val dndVersion: String = "5th Edition",
    val recommendedClasses: Boolean = true,
    val friendsList: List<String> = emptyList()
)