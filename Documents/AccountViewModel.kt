package com.team01.dndcreogen.profile
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountViewModel : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    private val _saveSuccess = MutableLiveData<Boolean>()
    val saveSuccess: LiveData<Boolean> get() = _saveSuccess

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    // Load a user into the ViewModel (call this when the account page opens)
    fun loadUser(user: User) {
        _user.value = user
    }

    // Update email
    fun updateEmail(newEmail: String) {
        if (newEmail.isBlank() || !android.util.Patterns.EMAIL_ADDRESS.matcher(newEmail).matches()) {
            _errorMessage.value = "Please enter a valid email address."
            return
        }
        _user.value = _user.value?.copy(email = newEmail)
        _saveSuccess.value = true
    }

    // Update password (accepts pre-hashed value from UI layer)
    fun updatePassword(newPasswordHash: String) {
        if (newPasswordHash.isBlank()) {
            _errorMessage.value = "Password cannot be empty."
            return
        }
        _user.value = _user.value?.copy(passwordHash = newPasswordHash)
        _saveSuccess.value = true
    }

    // Update D&D version setting
    fun updateDndVersion(version: String) {
        _user.value = _user.value?.copy(dndVersion = version)
    }

    // Toggle recommended classes setting
    fun toggleRecommendedClasses(enabled: Boolean) {
        _user.value = _user.value?.copy(recommendedClasses = enabled)
    }

    // Get current user snapshot (used by other fragments/activities)
    fun getCurrentUser(): User? = _user.value
}