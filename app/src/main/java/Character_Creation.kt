import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class Character_Creation(
    private val race_Repo: RaceRepository,
    private val class_Repo: Class_Repository,
    private val item_Repo: Item_Repository
) : ViewModel() {

    // ---- The Character that is being created ------
    private val _character = MutableStateFlow( Character(ch_Name = null, ch_Race = null, ch_Class = null))
    val character: StateFlow<Character> get() = _character.asStateFlow()

    // ---- Ability Score rolling and adjustment handling -----


}