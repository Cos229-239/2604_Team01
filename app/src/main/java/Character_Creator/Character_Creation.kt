package Character_Creator

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.*
import model.RaceRepository
import com.example.team01_application.*

val raceInst = RaceRepository()

class Character_Creation() : ViewModel() {

    // ---- The Character that is being created ------
    private val _character = MutableStateFlow( Character())
    val character: StateFlow<Character> get() = _character.asStateFlow()

    // ---- Ability Score rolling and adjustment handling -----
    private val _ability_Scores = MutableLiveData<ch_Ability_Scores>().apply {
        value = Ability_Score.entries.associateWith { 10 }
    }

    /*
    This is supposed to make the Ability Scores live data, meaning that it is one instance that can
    continue to be manipulated without creating redundancy. Once again, it is not pulling the value
    for some reason.
     */
    val Ability_Scores: LiveData<ch_Ability_Scores> = _ability_Scores

    /*
    This sets the ability scores to a default number if they do not already have a value.
     */
    fun Set_Ability_Scores(attribute: Ability_Score, newValue: Int)
    {
        val current = _ability_Scores.value ?: return
        if (current.get(attribute) == newValue) { return }

        val updated = current.toMutableMap()
        updated[attribute] = newValue
        _ability_Scores.value = updated
    }
}