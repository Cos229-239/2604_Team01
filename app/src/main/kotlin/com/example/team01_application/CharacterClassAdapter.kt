package com.example.team01_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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

    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {

        val characterClass = classes[position]

        holder.nameText.text = characterClass.name

        holder.classIcon.setImageResource(characterClass.imageResId)
    }

    override fun getItemCount(): Int {
        return classes.size
    }
}