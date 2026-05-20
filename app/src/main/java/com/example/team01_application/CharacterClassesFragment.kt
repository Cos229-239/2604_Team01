package com.example.team01_application

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

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

        val classText = allClasses.joinToString("\n\n") {
            "${it.name}\n${it.description}"
        }

        view.findViewById<TextView>(R.id.classTextView).text = classText

        return view
    }
}