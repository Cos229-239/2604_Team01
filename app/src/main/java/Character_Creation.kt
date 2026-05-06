import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class Character_Creation : ViewModel() {

    // ------ Used to encapsulate the data for usage -----------
    private val _character = MutableLiveData<Character>(Character(ch_Name = "New"))
    val character: LiveData<Character> = _character

    fun Set_Name(ch_Name: String)
    { _character.value = _character.value?.copy(ch_Name = ch_Name)}

    fun Set_Level(ch_Level: Int)
    { _character.value = _character.value?.copy(ch_Level = ch_Level)}

    fun Set_Race(ch_Race: Race)
    { _character.value = _character.value?.copy(ch_Race = ch_Race) }

    fun Set_Class(ch_Class: CharClass)
    { _character.value = _character.value?.copy(ch_Class = ch_Class) }

    fun Save_Character()
    { viewModelScope.launch { }}
}