package com.example.team01_application.ui.campaigns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.team01_application.R
import com.example.team01_application.model.CampaignManager

// Fragment that displays the list of campaigns the user is part of (as DM or player)
class CampaignListFragment : Fragment() {

    private val campaignManager = CampaignManager()

    // Inflates the layout for this fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_campaign_list, container, false)
    }

    // Called after the view is created - good place to setup UI and load data
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val statusText = view.findViewById<TextView>(R.id.tv_campaign_status)
        loadCampaigns(statusText)
    }

    // Loads the user's campaigns and updates the UI
    private fun loadCampaigns(statusText: TextView) {
        val currentUserId = "current_user_placeholder" // TODO: Replace later with real user ID

        val campaigns = campaignManager.getMyCampaigns(currentUserId)

        // Fixed: Using string resource
        statusText.text = getString(R.string.campaigns_loaded, campaigns.size)
    }
}