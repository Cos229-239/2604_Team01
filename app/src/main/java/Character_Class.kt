data class Character_Class(
    val ch_Name: String,
    val ch_Level: Int,
    val ch_Race: Race,
    val ch_Class: CharClass,
    val ch_Ability_Scores: Map<String, Int>,
    val ch_Inventory: List<InventoryItem> = emptyList()
)
