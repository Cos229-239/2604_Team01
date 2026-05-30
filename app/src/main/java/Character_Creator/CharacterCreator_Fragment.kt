package Character_Creator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import Character_Creator.ViewModel.Character_Creator_ViewModel
import com.example.team01_application.R
import model.RaceRepository
import com.example.team01_application.*
import com.example.team01_application.databinding.FragmentCharacterCreationBinding

/*
This is the overall character creation fragment that would tie in all the functionality to
create a character.
 */
class CharacterCreation_Fragment : Fragment() {

    /*
    Binding the fragment to the UI
     */
    private lateinit var binding: FragmentCharacterCreationBinding

    /*
    This was going to be a value that would assist in the utilization of multiple view models but
    I never got around to figure out how it worked fully.
     */
    private val viewModel: Character_Creator_ViewModel by viewModels()

    /*
    The create view for the character creator, binding the fragment once again and returning the root
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate using View Binding.
        binding = FragmentCharacterCreationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //   Set up the Race dropdown. For some reason it was having trouble accessing the list of races.
        val raceAdapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_spinner_item,
            model.RaceRepository.raceList)
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerRace.adapter = raceAdapter

        //   Set up the Class dropdown.
        val classAdapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_spinner_item,
            allClasses)
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerClass.adapter = classAdapter

        // Set up the RecyclerView.
        binding.recyclerAbilityScores.layoutManager = LinearLayoutManager(requireContext())
        val adapter = Ability_Score_Adapter(viewModel.scores)
        binding.recyclerAbilityScores.adapter = adapter

        //  When the user presses Create.
        binding.btnCreate.setOnClickListener {
            // Grab the name the user typed.
            val name = binding.editName.text.toString().trim()

            // If no name, show a message.
            if (name.isEmpty()) {
                Toast.makeText(requireContext(), "Please enter a name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Grab selected Race and Class from the dropdowns.
            val selectedRace = binding.spinnerRace.selectedItem as String
            val selectedClass = binding.spinnerClass.selectedItem as String

            // Build a new Character. For some reason it didn't want to accept the values that I had
            // set up in the Character class, but those are the right names for the values.
            val character = Character(
                ch_Name = name,
                ch_Race = selectedRace,
                ch_Class = selectedClass,
                ch_Ability_Scores = viewModel.scores
            )
            // This is where the character save would be, this is just a placeholder telling the user
            // that a character has been created.
            Toast.makeText(requireContext(),
                "Created ${character.ch_Name} (${character.ch_Race}, ${character.ch_Class})",
                Toast.LENGTH_LONG).show()
        }
    }

}