package com.example.team01_application.model

import com.example.team01_application.jeremiahgeigenmiller.User

// Handles all friend-related operations
class FriendManager {

    // TODO: Later this will connect to Firebase Firestore
    private val friendRequests = mutableListOf<FriendRequest>()

    // Send a friend request to another user
    fun sendFriendRequest(fromUserId: String, toUserId: String): Boolean {
        if (fromUserId == toUserId) return false

        val request = FriendRequest(
            requestId = "fr_${System.currentTimeMillis()}",
            fromUserId = fromUserId,
            toUserId = toUserId
        )
        friendRequests.add(request)
        println("✅ Friend request sent from $fromUserId to $toUserId")
        return true
    }

    // Accept a friend request
    fun acceptFriendRequest(requestId: String): Boolean {
        val request = friendRequests.find { it.requestId == requestId } ?: return false

        println("✅ Friend request $requestId accepted")
        return true
    }

    // Get all pending friend requests for a user
    fun getPendingRequests(userId: String): List<FriendRequest> {
        return friendRequests.filter {
            it.toUserId == userId && it.isPending()
        }
    }

    // Get a user's friends list
    fun getFriends(userId: String): List<User> {
        // TODO: Will be updated when we have a proper friends collection
        return emptyList()
    }

    // Reject a friend request
    fun rejectFriendRequest(requestId: String): Boolean {
        val request = friendRequests.find { it.requestId == requestId } ?: return false
        println("❌ Friend request $requestId rejected")
        return true
    }
}