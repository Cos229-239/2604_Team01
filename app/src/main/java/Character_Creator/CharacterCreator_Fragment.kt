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

class CharacterCreation_Fragment : Fragment() {

    private lateinit var binding: fragment_character_creator_Binding

    private val viewModel: Character_Creator_ViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate using View Binding.
        binding = fragment_character_creator_Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 3️⃣a  Set up the Race spinner.
        val raceAdapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_spinner_item,
            model.RaceRepository.companion.raceList)
        raceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerRace.adapter = raceAdapter

        // 3️⃣b  Set up the Class spinner.
        val classAdapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_spinner_item,
            allClasses)
        classAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerClass.adapter = classAdapter

        // 3️⃣c  Set up the RecyclerView.
        binding.recyclerViewAbilities.layoutManager = LinearLayoutManager(requireContext())
        val adapter = Ability_Score_Adapter(viewModel.scores)
        binding.recyclerViewAbilities.adapter = adapter

        // 3️⃣d  When the user presses Create.
        binding.buttonCreate.setOnClickListener {
            // Grab the name the user typed.
            val name = binding.editTextName.text.toString().trim()

            // If no name, show a message.
            if (name.isEmpty()) {
                Toast.makeText(requireContext(), "Please enter a name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Grab selected Race and Class from the spinners.
            val selectedRace = binding.spinnerRace.selectedItem as String
            val selectedClass = binding.spinnerClass.selectedItem as String

            // Build a new Character.
            val character = Character(
                ch_Name = name,
                ch_Race = selectedRace,
                ch_Class = selectedClass,
                ch_Ability_Scores = viewModel.scores
            )
            // In a real app you would now save or send this character.
            Toast.makeText(requireContext(),
                "Created ${character.ch_Name} (${character.ch_Race}, ${character.ch_Class})",
                Toast.LENGTH_LONG).show()
        }
    }

}