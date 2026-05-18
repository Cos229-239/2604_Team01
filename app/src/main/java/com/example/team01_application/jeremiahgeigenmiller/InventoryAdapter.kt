package com.example.team01_application.jeremiahgeigenmiller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.team01_application.R

class InventoryAdapter(private val items: List<InventoryItem>) :
    RecyclerView.Adapter<InventoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItemName: TextView = view.findViewById(R.id.tvItemName)
        val tvItemType: TextView = view.findViewById(R.id.tvItemType)
        val tvItemDescription: TextView = view.findViewById(R.id.tvItemDescription)
        val tvItemQuantity: TextView = view.findViewById(R.id.tvItemQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_inventory, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.tvItemName.text = item.name
        holder.tvItemType.text = item.type
        holder.tvItemDescription.text = item.description
        holder.tvItemQuantity.text = if (item.quantity > 1) "x${item.quantity}" else ""
    }

    override fun getItemCount(): Int = items.size
}