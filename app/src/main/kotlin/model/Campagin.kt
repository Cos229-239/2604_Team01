package com.example.team01_application.model

data class Campaign(
    val campaignId: String = "",
    val dmUserId: String = "",
    val campaignName: String = "",
    val description: String = "",
    val worldSetting: String? = null,
    val createdAt: Long = System.currentTimeMillis(),
    val playerUserIds: MutableList<String> = mutableListOf()
) {
    // Secondary constructor for Firebase / serialization
    constructor() : this(
        campaignId = "",
        dmUserId = "",
        campaignName = "",
        description = "",
        worldSetting = null,
        createdAt = System.currentTimeMillis(),
        playerUserIds = mutableListOf()
    )

    fun addPlayer(userId: String) {
        if (!playerUserIds.contains(userId)) {
            playerUserIds.add(userId)
        }
    }

    fun removePlayer(userId: String) {
        playerUserIds.remove(userId)
    }
}