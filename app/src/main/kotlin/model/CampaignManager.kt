package com.example.team01_application.model

class CampaignManager {

    private val campaigns = mutableListOf<Campaign>()

    // Creates a new campaign (used by DM)
    fun createCampaign(dmUserId: String, campaignName: String, description: String = ""): Campaign {
        val campaign = Campaign(
            campaignId = "camp_${System.currentTimeMillis()}",
            dmUserId = dmUserId,
            campaignName = campaignName,
            description = description
        )
        campaigns.add(campaign)
        println("✅ Campaign created: $campaignName")
        return campaign
    }

    // Adds a player to an existing campaign
    fun addPlayerToCampaign(campaignId: String, playerUserId: String): Boolean {
        val campaign = campaigns.find { it.campaignId == campaignId } ?: return false
        campaign.addPlayer(playerUserId)
        println("✅ Player $playerUserId added to campaign $campaignId")
        return true
    }

    // Returns all campaigns a user is part of (as DM or player)
    fun getMyCampaigns(userId: String): List<Campaign> {
        return campaigns.filter {
            it.dmUserId == userId || it.playerUserIds.contains(userId)
        }
    }

    // Get a specific campaign by ID
    fun getCampaignById(campaignId: String): Campaign? {
        return campaigns.find { it.campaignId == campaignId }
    }

    // Remove a player from a campaign (DM only)
    fun removePlayerFromCampaign(campaignId: String, playerUserId: String): Boolean {
        val campaign = campaigns.find { it.campaignId == campaignId } ?: return false
        campaign.removePlayer(playerUserId)
        return true
    }
}