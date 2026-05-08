package com.example.team01_application.model

data class TempUser(
    val userId: String = "",
    val username: String = "",
    val email: String = "",
    val profilePictureUrl: String? = null
) {
    // Secondary constructor for Firebase / serialization
    constructor() : this("", "", "", null)
}