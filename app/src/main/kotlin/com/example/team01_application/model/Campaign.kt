package com.example.team01_application.model

// Main data class representing a DnD Campaign
data class Campaign(
    val campaignId: String = "",
    val dmUserId: String = "",           // Uses User's "id"
    val campaignName: String = "",
    val description: String = "",
    val worldSetting: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val playerUserIds: MutableList<String> = mutableListOf()
) {
    // Empty constructor needed for Firebase / serialization
    constructor() : this("", "", "", "", null, System.currentTimeMillis(), mutableListOf())

    // Add a player to this campaign
    fun addPlayer(userId: String) {
        if (!playerUserIds.contains(userId)) {
            playerUserIds.add(userId)
        }
    }

    // Remove a player from this campaign
    fun removePlayer(userId: String) {
        playerUserIds.remove(userId)
    }

    // Check if a user is the Dungeon Master of this campaign
    fun isDM(userId: String): Boolean = dmUserId == userId
}