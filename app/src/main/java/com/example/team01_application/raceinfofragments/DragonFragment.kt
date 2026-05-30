package com.example.team01_application.raceinfofragments

import android.os.Bundle
import com.example.team01_application.R
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import model.RaceRepository

// fragment to display dragonborn's info
class DragonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(
            R.layout.fragment_dragon,
            container,
            false
        )

        val raceRepository = RaceRepository()
        val dragonRace = raceRepository.dragonBornRace

        view.findViewById<TextView>(R.id.tvDragonName).text = dragonRace.name
        view.findViewById<TextView>(R.id.tvDragonDescription).text = dragonRace.description
        view.findViewById<TextView>(R.id.tvDragonBackground).text = dragonRace.background
        view.findViewById<TextView>(R.id.tvDragonTraits).text = dragonRace.traits

        return view
    }
}