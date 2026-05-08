package com.team01.dndcreogen.inventory

/**
 * Represents a single item in a character's inventory.
 * Malik George: this is the data model for the inventory system.
 */
data class InventoryItem(
    val id: Int = 0,
    val characterId: Int = 0,
    val itemName: String = "",
    val description: String = ""
)