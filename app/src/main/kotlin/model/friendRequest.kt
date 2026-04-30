package com.example.team01_application.model

data class FriendRequest(
    val requestId: String = "",
    val fromUserId: String = "",
    val toUserId: String = "",
    val status: String = "PENDING",      // PENDING, ACCEPTED, REJECTED
    val timestamp: Long = System.currentTimeMillis()
) {
    // Secondary constructor for Firebase
    constructor() : this(
        requestId = "",
        fromUserId = "",
        toUserId = "",
        status = "PENDING",
        timestamp = System.currentTimeMillis()
    )
}