package Character_Creator.ViewModel

import androidx.lifecycle.ViewModel
import Character_Creator.*

class Character_Creator_ViewModel : ViewModel() {

    val scores: MutableMap<Ability_Score, Int> = mutableMapOf(
        Ability_Score.STRENGTH to 10,
        Ability_Score.DEXTERITY to 10,
        Ability_Score.CONSTITUTION to 10,
        Ability_Score.INTELLIGENCE to 10,
        Ability_Score.WISDOM to 10,
        Ability_Score.CHARISMA to 10
    )
}