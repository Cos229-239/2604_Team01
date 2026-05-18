package com.example.team01_application.jeremiahgeigenmiller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.team01_application.R

class InventoryFragment : Fragment() {

    private var characterClass: String = "barbarian"

    companion object {
        fun newInstance(characterClass: String): InventoryFragment {
            val fragment = InventoryFragment()
            fragment.characterClass = characterClass
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_inventory, container, false)

        val items = ClassInventory.getStartingItems(characterClass)

        view.findViewById<TextView>(R.id.tvClassName).text =
            "${characterClass.replaceFirstChar { it.uppercase() }} Starting Inventory"

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvInventory)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = InventoryAdapter(items)

        return view
    }
}