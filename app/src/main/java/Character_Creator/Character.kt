package Character_Creator

import model.Race
import team01_application.CharacterClass

enum class Ability_Score {
    STR, DEX, CON, INT, WIS, CHA
}

class Character {

    val ch_Name: String? = null
    val ch_Race: Race? = null
    val ch_Class: CharacterClass? = null
    val ch_Ability_Scores: MutableMap<Ability_Score, Int> = mutableMapOf()

}