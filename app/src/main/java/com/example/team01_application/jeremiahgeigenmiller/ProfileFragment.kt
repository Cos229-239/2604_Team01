package com.example.team01_application.jeremiahgeigenmiller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.team01_application.R

class ProfileFragment : Fragment() {

    private val viewModel: ProfileViewModel by viewModels()

    private lateinit var tvUsername: TextView
    private lateinit var etEmail: EditText
    private lateinit var etBio: EditText
    private lateinit var spinnerDndVersion: Spinner
    private lateinit var switchRecommendedClasses: Switch
    private lateinit var btnSave: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_profile, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        setupDndVersionSpinner()
        observeViewModel()
        loadDemoUser()
        setupListeners()
    }

    private fun bindViews(view: View) {
        tvUsername = view.findViewById(R.id.tvUsername)
        etEmail = view.findViewById(R.id.etEmail)
        etBio = view.findViewById(R.id.etBio)
        spinnerDndVersion = view.findViewById(R.id.spinnerDndVersion)
        switchRecommendedClasses = view.findViewById(R.id.switchRecommendedClasses)
        btnSave = view.findViewById(R.id.btnSaveProfile)
    }

    private fun setupDndVersionSpinner() {
        val versions = listOf("5th Edition", "3.5 Edition", "4th Edition", "Pathfinder")
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_spinner_item,
            versions
        ).apply { setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
        spinnerDndVersion.adapter = adapter
    }

    private fun observeViewModel() {
        viewModel.user.observe(viewLifecycleOwner) { user ->
            tvUsername.text = user.username
            etEmail.setText(user.email)
            etBio.setText(user.bio)
            switchRecommendedClasses.isChecked = user.recommendedClasses
            val versions = listOf("5th Edition", "3.5 Edition", "4th Edition", "Pathfinder")
            spinnerDndVersion.setSelection(versions.indexOf(user.dndVersion).coerceAtLeast(0))
        }

        viewModel.saveSuccess.observe(viewLifecycleOwner) { success ->
            if (success) Toast.makeText(requireContext(), "Saved!", Toast.LENGTH_SHORT).show()
        }

        viewModel.errorMessage.observe(viewLifecycleOwner) { msg ->
            Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()
        }
    }

    private fun setupListeners() {
        btnSave.setOnClickListener {
            viewModel.updateEmail(etEmail.text.toString())
            viewModel.updateBio(etBio.text.toString())
            viewModel.updateDndVersion(spinnerDndVersion.selectedItem.toString())
            viewModel.toggleRecommendedClasses(switchRecommendedClasses.isChecked)
        }
    }

    private fun loadDemoUser() {
        val demoUser = User(
            id = 1,
            username = "JeremiahG",
            email = "jeremiah@example.com",
            dndVersion = "5th Edition",
            recommendedClasses = true,
            friendsList = listOf()
        )
        viewModel.loadUser(demoUser)
    }
}