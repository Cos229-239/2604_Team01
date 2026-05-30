package com.example.team01_application

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Fragment responsible for displaying all available character classes.
 *
 * Initializes the RecyclerView, applies a layout manager,
 * and connects the CharacterClassAdapter to the data source.
 */
class CharacterClassesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(
            R.layout.fragment_character_classes,
            container,
            false
        )
// Locate the RecyclerView defined in fragment_character_classes.xml.
        val recyclerView = view.findViewById<RecyclerView>(R.id.classRecyclerView)

        // Display classes in a vertically scrolling list.
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Adapter automatically displays all CharacterClass objects
        // contained in the allClasses list.
        // To add a new class, create a CharacterClass object and
        // add it to allClasses.
        recyclerView.adapter = CharacterClassAdapter(allClasses)

        return view
    }
}