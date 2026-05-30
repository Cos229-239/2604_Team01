package Character_Creator.ViewModel

import androidx.lifecycle.ViewModel
import Character_Creator.*

/*
This is just a skeleton of the view model that I was going to put together so that the display would
look more put together.
I just put the placeholders of the ability scores in there earlier this month and didn't get around
to messing with the full view model.
 */
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