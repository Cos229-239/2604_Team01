package com.example.team01_application.jeremiahgeigenmiller

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.team01_application.R

class InventoryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var btnAddItem: Button
    private lateinit var adapter: InventoryAdapter

    private val inventoryItems = mutableListOf<InventoryItem>()

    companion object {
        fun newInstance(characterClass: String): InventoryFragment {
            val fragment = InventoryFragment()
            fragment.characterClass = characterClass
            return fragment
        }
    }

    private var characterClass: String = "barbarian"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_inventory, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.rv_inventory)
        btnAddItem = view.findViewById(R.id.btn_add_item)

        // Load starting items for the character class
        val startingItems = ClassInventory.getStartingItems(characterClass)
        inventoryItems.addAll(startingItems)

        adapter = InventoryAdapter(inventoryItems) { item ->
            showDeleteConfirmation(item)
        }

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        btnAddItem.setOnClickListener {
            showAddItemDialog()
        }
    }

    private fun showAddItemDialog() {
        val dialogView = LayoutInflater.from(requireContext())
            .inflate(R.layout.dialog_add_item, null)

        val etItemName = dialogView.findViewById<EditText>(R.id.et_dialog_item_name)
        val etDescription = dialogView.findViewById<EditText>(R.id.et_dialog_description)

        AlertDialog.Builder(requireContext())
            .setTitle("Add Item")
            .setView(dialogView)
            .setPositiveButton("Add") { _, _ ->
                val name = etItemName.text.toString().trim()
                val desc = etDescription.text.toString().trim()
                if (name.isNotEmpty()) {
                    val newItem = InventoryItem(
                        id = inventoryItems.size + 1,
                        itemName = name,
                        description = desc
                    )
                    adapter.addItem(newItem)
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun showDeleteConfirmation(item: InventoryItem) {
        AlertDialog.Builder(requireContext())
            .setTitle("Remove Item")
            .setMessage("Remove \"${item.itemName}\" from inventory?")
            .setPositiveButton("Remove") { _, _ -> adapter.removeItem(item) }
            .setNegativeButton("Cancel", null)
            .show()
    }
}