package com.example.team01_application.model

import com.example.team01_application.jeremiahgeigenmiller.User

// TODO: This will later connect to Firebase or backend
class FriendManager {

    fun sendFriendRequest(fromUserId: String, toUserId: String) {
        println("Friend request sent from $fromUserId to $toUserId")
    }

    fun acceptFriendRequest(requestId: String) {
        println("Friend request $requestId accepted")
    }

    // Updated to use Jeremiah's User class
    fun getFriends(userId: String): List<User> {
        // TODO: Return actual friends when backend is connected
        return emptyList()
    }

    fun getPendingRequests(userId: String): List<FriendRequest> {
        return emptyList()
    }
}