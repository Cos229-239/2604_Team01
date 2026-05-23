package Character_Creator

import model.Race
import com.example.team01_application.*

enum class Ability_Score {
    STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA
}

class Character {

    val ch_Name: String? = null
    val ch_Race: Race? = null
    val ch_Class: CharacterClass? = null
    val ch_Ability_Scores: MutableMap<Ability_Score, Int> = mutableMapOf()

}