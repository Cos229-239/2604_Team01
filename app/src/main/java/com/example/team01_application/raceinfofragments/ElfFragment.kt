package com.example.team01_application.raceinfofragments

import android.os.Bundle
import com.example.team01_application.R
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import model.RaceRepository

class ElfFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_elf,
            container,
            false
        )

        val raceRepository = RaceRepository()
        val elfRace = raceRepository.elfRace

        view.findViewById<TextView>(R.id.tvElfName).text = elfRace.name
        view.findViewById<TextView>(R.id.tvElfDescription).text = elfRace.description
        view.findViewById<TextView>(R.id.tvElfBackground).text = elfRace.background
        view.findViewById<TextView>(R.id.tvElfTraits).text = elfRace.traits

        return view
    }
}