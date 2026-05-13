package com.example.team01_application.model

class CampaignManager {

    private val campaigns = mutableListOf<Campaign>()

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

    fun addPlayerToCampaign(campaignId: String, playerUserId: String): Boolean {
        val campaign = campaigns.find { it.campaignId == campaignId } ?: return false
        campaign.addPlayer(playerUserId)
        println("✅ Player $playerUserId added to campaign $campaignId")
        return true
    }

    fun getMyCampaigns(userId: String): List<Campaign> {
        return campaigns.filter {
            it.dmUserId == userId || it.playerUserIds.contains(userId)
        }
    }

    fun getCampaignById(campaignId: String): Campaign? {
        return campaigns.find { it.campaignId == campaignId }
    }

    fun removePlayerFromCampaign(campaignId: String, playerUserId: String): Boolean {
        val campaign = campaigns.find { it.campaignId == campaignId } ?: return false
        campaign.removePlayer(playerUserId)
        return true
    }
}