package com.example.team01_application.jeremiahgeigenmiller

data class InventoryItem(
    val id: String = "",
    val name: String = "",
    val type: String = "",
    val description: String = "",
    val quantity: Int = 1,
    val isStartingItem: Boolean = false
)