package Character_Creator

import model.Race
import com.example.team01_application.*

/*
General enum for ability scores
 */
enum class Ability_Score {
    STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA
}

/*
The overall character class with all values that pertain to the character.
The values don't seem to be playing well with the rest of the code but I think it's a simple parameter
fix.
 */
class Character {

    val ch_Name: String? = null
    val ch_Race: Race? = null
    val ch_Class: CharacterClass? = null
    val ch_Ability_Scores: MutableMap<Ability_Score, Int> = mutableMapOf()

}

/*
General Note:
To fully make this a true character creator, you will need to add a string for ideals, flaws, and
background. There is a list of predetermined values for all of these on D&D wiki. I would make each
of them an inherited class of a character traits class and then generate them all that way.
 */