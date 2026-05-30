package com.example.team01_application.raceinfofragments

import android.os.Bundle
import com.example.team01_application.R
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import model.RaceRepository

// fragment to display dwarf's info
class DwarfFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_dwarf,
            container,
            false
        )

        val raceRepository = RaceRepository()
        val dwarfRace = raceRepository.dwarfRace

        view.findViewById<TextView>(R.id.tvDwarfName).text = dwarfRace.name
        view.findViewById<TextView>(R.id.tvDwarfDescription).text = dwarfRace.description
        view.findViewById<TextView>(R.id.tvDwarfBackground).text = dwarfRace.background
        view.findViewById<TextView>(R.id.tvDwarfTraits).text = dwarfRace.traits

        return view
    }
}