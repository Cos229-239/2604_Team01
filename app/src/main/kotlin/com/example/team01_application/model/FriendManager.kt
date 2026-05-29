package com.example.team01_application.model

import com.example.team01_application.jeremiahgeigenmiller.User

// Handles all friend-related operations
class FriendManager {

    private val friendRequests = mutableListOf<FriendRequest>()

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

    fun acceptFriendRequest(requestId: String): Boolean {
        val request = friendRequests.find { it.requestId == requestId } ?: return false
        println("✅ Friend request $requestId accepted")
        return true
    }

    fun getPendingRequests(userId: String): List<FriendRequest> {
        return friendRequests.filter {
            it.toUserId == userId && it.isPending()
        }
    }

    fun getFriends(userId: String): List<User> {
        // TODO: Implement when backend is ready
        return emptyList()
    }

    fun rejectFriendRequest(requestId: String): Boolean {
        val request = friendRequests.find { it.requestId == requestId } ?: return false
        println("❌ Friend request $requestId rejected")
        return true
    }
}