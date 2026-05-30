package com.example.team01_application.ui.campaigns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.team01_application.R
import com.example.team01_application.model.CampaignManager

// Dialog that allows a DM to add a player to a specific campaign
class AddPlayerDialog(
    private val campaignId: String,           // ID of the campaign we're adding to
    private val onPlayerAdded: () -> Unit     // Callback when player is successfully added
) : DialogFragment() {

    private val campaignManager = CampaignManager()

    // Inflates the dialog layout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_add_player, container, false)
    }

    // Sets up button listeners after the view is created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etPlayerUsername = view.findViewById<EditText>(R.id.et_player_username)
        val btnAdd = view.findViewById<Button>(R.id.btn_add_player)
        val btnCancel = view.findViewById<Button>(R.id.btn_cancel)

        // Handle "Add Player" button click
        btnAdd.setOnClickListener {
            val usernameOrId = etPlayerUsername.text.toString().trim()

            if (usernameOrId.isEmpty()) {
                Toast.makeText(requireContext(), "Please enter a username or user ID", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // For now, we use the input as userId (later we can search by username)
            val success = campaignManager.addPlayerToCampaign(campaignId, usernameOrId)

            if (success) {
                Toast.makeText(requireContext(), "Player added successfully!", Toast.LENGTH_SHORT).show()
                onPlayerAdded()
                dismiss()
            } else {
                Toast.makeText(requireContext(), "Failed to add player", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle "Cancel" button click
        btnCancel.setOnClickListener {
            dismiss()
        }
    }

    // Makes the dialog a nice size (85% of screen width)
    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            (resources.displayMetrics.widthPixels * 0.85).toInt(),
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    }
}