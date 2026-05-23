package com.example.team01_application.jeremiahgeigenmiller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.team01_application.R

class ProfileFragment : Fragment() {

    private val viewModel = ProfileViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val etUsername = view.findViewById<EditText>(R.id.etUsername)
        val etEmail = view.findViewById<EditText>(R.id.etEmail)
        val etBio = view.findViewById<EditText>(R.id.etBio)
        val btnSave = view.findViewById<Button>(R.id.btnSaveProfile)
        val tvConfirmation = view.findViewById<TextView>(R.id.tvSaveConfirmation)

        // Load current user data into fields
        val user = viewModel.getUser()
        etUsername.setText(user.username)
        etEmail.setText(user.email)
        etBio.setText(user.bio)

        // Save button updates the user
        btnSave.setOnClickListener {
            viewModel.updateUsername(etUsername.text.toString())
            viewModel.updateEmail(etEmail.text.toString())
            viewModel.updateBio(etBio.text.toString())
            tvConfirmation.text = "Profile saved!"
        }

        return view
    }
}