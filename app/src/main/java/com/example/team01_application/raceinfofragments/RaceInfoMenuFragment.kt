package com.example.team01_application.raceinfofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.team01_application.R


class RaceInfoMenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_race_info_menu,
            container,
            false)


        // fragment to display
        val humanFragment = HumanFragment()
        val dwarfFragment = DwarfFragment()
        val elfFragment = ElfFragment()
        val dragonFragment = DragonFragment()

        val btnHumanFragment = view.findViewById<Button>(R.id.btnHumanFragment)
        val btnDwarfFragment = view.findViewById<Button>(R.id.btnDwarfFragment)
        val btnElfFragment = view.findViewById<Button>(R.id.btnElfFragment)
        val btnDragonFragment = view.findViewById<Button>(R.id.btnDragonFragment)


        // on click listeners
        // using my own frame layout to swap fragments, when we have a main activity I will swap

        btnHumanFragment.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flRaceMenuFragment, humanFragment)
                commit()
            }
        }

        btnDwarfFragment.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flRaceMenuFragment, dwarfFragment)
                commit()
            }
        }

        btnElfFragment.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flRaceMenuFragment, elfFragment)
                commit()
            }
        }

        btnDragonFragment.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flRaceMenuFragment, dragonFragment)
                commit()
            }
        }

        return view
    }

}