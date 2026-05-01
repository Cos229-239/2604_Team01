package com.example.team01_application.model

class CampaignManager {

    // Create a new campaign (DM only)
    fun createCampaign(dmUserId: String, campaignName: String, description: String = ""): Campaign {
        val campaign = Campaign(
            campaignId = "",           // Will be set by backend later
            dmUserId = dmUserId,
            campaignName = campaignName,
            description = description
        )
        // TODO: Save to backend
        println("Campaign '$campaignName' created by DM $dmUserId")
        return campaign
    }

    // Add a player to a campaign
    fun addPlayerToCampaign(campaignId: String, playerUserId: String) {
        // TODO: Update campaign in backend
        println("Added player $playerUserId to campaign $campaignId")
    }

    // Get campaigns where user is the DM
    fun getMyDMCampaigns(userId: String): List<Campaign> {
        return emptyList()
    }

    // Get campaigns where user is a player
    fun getMyPlayerCampaigns(userId: String): List<Campaign> {
        return emptyList()
    }
}