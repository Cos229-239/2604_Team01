package com.example.team01_application.model

data class FriendRequest(
    val requestId: String = "",
    val fromUserId: String = "",
    val toUserId: String = "",
    val status: String = "PENDING",     // PENDING, ACCEPTED, REJECTED
    val timestamp: Long = System.currentTimeMillis()
) {
    constructor() : this("", "", "", "PENDING", System.currentTimeMillis())

    fun isPending(): Boolean = status == "PENDING"
    fun isAccepted(): Boolean = status == "ACCEPTED"
    fun isRejected(): Boolean = status == "REJECTED"
}