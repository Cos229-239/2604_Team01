package com.example.team01_application.model

data class Campaign(
    val campaignId: String = "",
    val dmUserId: String = "",           // Uses User's "id"
    val campaignName: String = "",
    val description: String = "",
    val worldSetting: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val playerUserIds: MutableList<String> = mutableListOf()
) {
    constructor() : this("", "", "", "", null, System.currentTimeMillis(), mutableListOf())

    fun addPlayer(userId: String) {
        if (!playerUserIds.contains(userId)) {
            playerUserIds.add(userId)
        }
    }

    fun removePlayer(userId: String) {
        playerUserIds.remove(userId)
    }

    fun isDM(userId: String): Boolean = dmUserId == userId
}