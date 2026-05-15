package com.example.team01_application.ui.campaigns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.team01_application.R
import com.example.team01_application.model.CampaignManager

// Simple Fragment to show campaigns
class CampaignListFragment : Fragment() {

    private val campaignManager = CampaignManager()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout manually
        return inflater.inflate(R.layout.fragment_campaign_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val statusText = view.findViewById<TextView>(R.id.tv_campaign_status)
        loadCampaigns(statusText)
    }

    private fun loadCampaigns(statusText: TextView) {
        val currentUserId = "current_user_placeholder" // TODO: Replace later with real user ID

        val campaigns = campaignManager.getMyCampaigns(currentUserId)

        statusText.text = "Loaded ${campaigns.size} campaigns"
        println("✅ Loaded ${campaigns.size} campaigns")
    }
}