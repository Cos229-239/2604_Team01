package com.example.team01_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * RecyclerView adapter responsible for displaying character classes.
 *
 * Reads CharacterClass objects from allClasses and binds the
 * class name and icon to each row in the RecyclerView.
 *
 * Future enhancements:
 * - Click events for class details
 * - Expandable descriptions
 * - Class selection functionality
 */
class CharacterClassAdapter(
    private val classes: List<CharacterClass>
) : RecyclerView.Adapter<CharacterClassAdapter.ClassViewHolder>() {

    class ClassViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameText: TextView =
            itemView.findViewById(R.id.classNameText)

        val classIcon: ImageView =
            itemView.findViewById(R.id.classIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_character_class, parent, false)

        return ClassViewHolder(view)
    }
    /**
     * Populates each RecyclerView item with the appropriate
     * class name and icon based on the current position.
     */
    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {

        val characterClass = classes[position]

        holder.nameText.text = characterClass.name

        holder.classIcon.setImageResource(characterClass.imageResId)
    }

    override fun getItemCount(): Int {
        return classes.size
    }
}