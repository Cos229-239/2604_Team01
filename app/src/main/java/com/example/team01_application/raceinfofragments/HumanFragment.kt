package com.example.team01_application.raceinfofragments

import android.os.Bundle
import com.example.team01_application.R
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import model.RaceRepository

class HumanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_human,
            container,
            false
        )

        val raceRepository = RaceRepository()
        val humanRace = raceRepository.humanRace

        view.findViewById<TextView>(R.id.tvHumanName).text = humanRace.name
        view.findViewById<TextView>(R.id.tvHumanDescription).text = humanRace.description
        view.findViewById<TextView>(R.id.tvHumanBackground).text = humanRace.background
        view.findViewById<TextView>(R.id.tvHumanTraits).text = humanRace.traits

        return view
    }


}