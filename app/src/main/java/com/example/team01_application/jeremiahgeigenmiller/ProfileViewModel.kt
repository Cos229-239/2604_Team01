package com.example.team01_application.jeremiahgeigenmiller

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _user = MutableLiveData<User>()
    val user: LiveData<User> get() = _user

    private val _saveSuccess = MutableLiveData<Boolean>()
    val saveSuccess: LiveData<Boolean> get() = _saveSuccess

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String> get() = _errorMessage

    fun loadUser(user: User) {
        _user.value = user
    }

    fun updateEmail(newEmail: String) {
        if (newEmail.isBlank() || !android.util.Patterns.EMAIL_ADDRESS.matcher(newEmail).matches()) {
            _errorMessage.value = "Please enter a valid email address."
            return
        }
        _user.value = _user.value?.copy(email = newEmail)
        _saveSuccess.value = true
    }

    fun updateUsername(newUsername: String) {
        if (newUsername.isBlank()) {
            _errorMessage.value = "Username cannot be empty."
            return
        }
        _user.value = _user.value?.copy(username = newUsername)
        _saveSuccess.value = true
    }

    fun updateBio(newBio: String) {
        _user.value = _user.value?.copy(bio = newBio)
        _saveSuccess.value = true
    }

    fun updateDndVersion(version: String) {
        _user.value = _user.value?.copy(dndVersion = version)
    }

    fun toggleRecommendedClasses(enabled: Boolean) {
        _user.value = _user.value?.copy(recommendedClasses = enabled)
    }

    fun getCurrentUser(): User? = _user.value
}