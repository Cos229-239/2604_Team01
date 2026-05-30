package com.example.team01_application.model

// Data class representing a friend request between two users
data class FriendRequest(
    val requestId: String = "",
    val fromUserId: String = "",
    val toUserId: String = "",
    val status: String = "PENDING",     // PENDING, ACCEPTED, REJECTED
    val timestamp: Long = System.currentTimeMillis()
) {
    // Empty constructor required for Firebase / serialization
    constructor() : this("", "", "", "PENDING", System.currentTimeMillis())

    // Check if this friend request is still pending
    fun isPending(): Boolean = status == "PENDING"

    // Check if this friend request was accepted
    fun isAccepted(): Boolean = status == "ACCEPTED"

    // Check if this friend request was rejected
    fun isRejected(): Boolean = status == "REJECTED"
}