package com.example.team01_application.jeremiahgeigenmiller

class ProfileViewModel {
    private var currentUser: User = User()

    fun getUser(): User {
        return currentUser
    }

    fun updateUsername(newUsername: String) {
        currentUser = currentUser.copy(username = newUsername)
    }

    fun updateEmail(newEmail: String) {
        currentUser = currentUser.copy(email = newEmail)
    }

    fun updateBio(newBio: String) {
        currentUser = currentUser.copy(bio = newBio)
    }
}