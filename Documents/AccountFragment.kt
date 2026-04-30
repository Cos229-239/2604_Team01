package com.team01.dndcreogen.profile
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.team01.dndcreogen.R

class AccountFragment : Fragment() {

    private val viewModel: AccountViewModel by viewModels()

    private lateinit var tvUsername: TextView
    private lateinit var etEmail: EditText
    private lateinit var btnChangePassword: Button
    private lateinit var spinnerDndVersion: Spinner
    private lateinit var switchRecommendedClasses: Switch
    private lateinit var tvFriendsList: TextView
    private lateinit var btnSave: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_account, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        setupDndVersionSpinner()
        observeViewModel()
        loadDemoUser()
        setupListeners()
    }

    private fun bindViews(view: View) {
        tvUsername = view.findViewById(R.id.tv_username)
        etEmail = view.findViewById(R.id.et_email)
        btnChangePassword = view.findViewById(R.id.btn_change_password)
        spinnerDndVersion = view.findViewById(R.id.spinner_dnd_version)
        switchRecommendedClasses = view.findViewById(R.id.switch_recommended_classes)
        tvFriendsList = view.findViewById(R.id.tv_friends_list)
        btnSave = view.findViewById(R.id.btn_save)
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
            switchRecommendedClasses.isChecked = user.recommendedClasses
            tvFriendsList.text = if (user.friendsList.isEmpty()) "No friends yet"
            else user.friendsList.joinToString(", ")

            // Set spinner to match saved version
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
            viewModel.updateDndVersion(spinnerDndVersion.selectedItem.toString())
            viewModel.toggleRecommendedClasses(switchRecommendedClasses.isChecked)
        }

        btnChangePassword.setOnClickListener {
            // TODO: Open ChangePasswordDialogFragment
            Toast.makeText(requireContext(), "Change password coming soon", Toast.LENGTH_SHORT).show()
        }
    }

    // Demo user — replace with real auth/database call later
    private fun loadDemoUser() {
        val demoUser = User(
            id = 1,
            username = "JeremiahG",
            email = "jeremiah@example.com",
            dndVersion = "5th Edition",
            recommendedClasses = true,
            friendsList = listOf("JimmyTheOgre")
        )
        viewModel.loadUser(demoUser)
    }
}
