package ui.campaigns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.team01_application.R
import com.example.team01_application.model.CampaignManager

// Fragment that allows a DM to create a new campaign
class CreateCampaignFragment : Fragment() {

    private val campaignManager = CampaignManager()

    // Called when the fragment's view is first created
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_campaign, container, false)
    }

    // Called after the view is created - good place to set up UI listeners
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etCampaignName = view.findViewById<EditText>(R.id.et_campaign_name)
        val etDescription = view.findViewById<EditText>(R.id.et_description)
        val btnCreate = view.findViewById<Button>(R.id.btn_create_campaign)

        // Handle create button click
        btnCreate.setOnClickListener {
            val campaignName = etCampaignName.text.toString().trim()
            val description = etDescription.text.toString().trim()

            if (campaignName.isEmpty()) {
                Toast.makeText(requireContext(), "Campaign name is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // TODO: Replace with real DM user ID from authentication
            val dmUserId = "current_user_placeholder"

            val newCampaign = campaignManager.createCampaign(dmUserId, campaignName, description)

            Toast.makeText(requireContext(), "Campaign '$campaignName' created!", Toast.LENGTH_LONG).show()

            // TODO: Go back to campaign list or refresh
            parentFragmentManager.popBackStack()
        }
    }
}