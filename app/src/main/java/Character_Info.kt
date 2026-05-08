interface Race {
    val r_Name: String
    val r_Description: String
}

interface CharClass {
    val c_Name: String
    val hitDice: String
    val ch_Ability_Scores: Map<String, Int>
}

interface InventoryItem {
    val i_Name: String
    val i_Description: String
    val i_weight: Double
    val i_AC: Int? = null
    val i_Damage: List<Int>? = null
}

enum class Attribute { STR, DEX, CON, INT, WIS, CHA }