package com.example.team01_application.model

data class FriendRequest(
    val requestId: String = "",
    val fromUserId: String = "",
    val toUserId: String = "",
    val status: String = "PENDING",     // PENDING, ACCEPTED, REJECTED
    val timestamp: Long = System.currentTimeMillis()
) {
    // Empty constructor for Firebase
    constructor() : this("", "", "", "PENDING", System.currentTimeMillis())

    // Check if this request is still pending
    fun isPending(): Boolean = status == "PENDING"

    // Check if this request was accepted
    fun isAccepted(): Boolean = status == "ACCEPTED"

    // Check if this request was rejected
    fun isRejected(): Boolean = status == "REJECTED"
}