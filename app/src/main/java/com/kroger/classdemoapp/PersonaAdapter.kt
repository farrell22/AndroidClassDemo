package com.kroger.classdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonaAdapter(private val personas: List<Persona>) : RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PersonaViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
    )

    override fun getItemCount() = personas.size

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = personas[position]
        holder.personaName.text = persona.name
        holder.personaStartingLevel.text = persona.starting_level.toString()
        holder.personaArcana.text = persona.arcana
        holder.personaOrigin.text = persona.cultural_origin
        holder.personaWeaknesses.text = persona.weaknesses.toString()

    }

    class PersonaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val personaStartingLevel: TextView = itemView.findViewById(R.id.character_name)
        val personaName: TextView = itemView.findViewById(R.id.character_name)
        val personaArcana: TextView = itemView.findViewById(R.id.character_name)
        val personaOrigin: TextView = itemView.findViewById(R.id.character_name)
        val personaWeaknesses: TextView = itemView.findViewById(R.id.character_name)
    }
}
