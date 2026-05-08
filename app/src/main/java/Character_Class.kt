data class Character(

    // ----- Character Information --------
    val ch_Name: String? = null,
    val ch_Level: Int? = null,
    val ch_Race: Race? = null,
    val ch_Class: CharClass? = null,
    val ch_Ability_Scores: MutableMap<Attribute, Int>? = mutableMapOf(),
    val ch_Inventory: MutableList<InventoryItem> = mutableListOf()
)
{
    val isComplete: Boolean
        get() = ch_Race != null && ch_Class != null && ch_Inventory.isNotEmpty()

}
