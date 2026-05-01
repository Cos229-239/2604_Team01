package com.example.team01_application.model

// TODO: This will later connect to Firebase or backend
class FriendManager {

    // Send a friend request to another user
    fun sendFriendRequest(fromUserId: String, toUserId: String) {
        // TODO: Implement logic (save to Firestore, etc.)
        println("Friend request sent from $fromUserId to $toUserId")
    }

    // Accept a friend request
    fun acceptFriendRequest(requestId: String) {

        println("Friend request $requestId accepted")
    }

    // Get list of friends for a user
    fun getFriends(userId: String): List<User> {
        // TODO: Return actual friends
        return emptyList()
    }

    // Get pending friend requests
    fun getPendingRequests(userId: String): List<FriendRequest> {
        return emptyList()
    }
}