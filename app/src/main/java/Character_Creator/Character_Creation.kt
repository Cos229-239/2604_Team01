package Character_Creator

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.*
import model.RaceRepository
import team01_application.CharacterClasses.allClasses

class Character_Creation(
    private val race_Repo: RaceRepository,
    private val class_Repo: allClasses,
    private val item_Repo: Item_Repository
) : ViewModel() {

    // ---- The Character that is being created ------
    private val _character = MutableStateFlow( Character(ch_Name = null, ch_Race = null, ch_Class = null))
    val character: StateFlow<Character> get() = _character.asStateFlow()

    // ---- Ability Score rolling and adjustment handling -----
    private val _ability_Scores = MutableLiveData<ch_Ability_Scores>().apply {
        value = Ability_Score.entries.associateWith { 10 }
    }

    val Ability_Scores: LiveData<ch_Ability_Scores> = _ability_Scores

    fun Set_Ability_Scores(attribute: Ability_Score, newValue: Int)
    {
        val current = _ability_Scores.value ?: return
        if (current.get(attribute) == newValue) { return }

        val updated = current.toMutableMap()
        updated[attribute] = newValue
        _ability_Scores.value = updated
    }
}