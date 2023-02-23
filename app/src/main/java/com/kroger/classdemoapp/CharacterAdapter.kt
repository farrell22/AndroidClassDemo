package com.kroger.classdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class CharacterAdapter(private val characters: List<Character>) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CharacterViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.character_card_view, parent, false)
    )

    override fun getItemCount() = characters.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.characterImage.setImageResource(character.image)
        holder.characterName.text = character.name
        holder.characterStartingLevel.text = character.startingLevel.toString()
        holder.characterRegion.text = character.region
        holder.pokedexNumber.text = character.pokedexNumber.toString()
        holder.elementalType.text = character.elementalType
    }

    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val characterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterStartingLevel: TextView = itemView.findViewById(R.id.character_startingLevel)
        val characterRegion:TextView = itemView.findViewById(R.id.character_region)
        val pokedexNumber: TextView = itemView.findViewById(R.id.character_pokedex)
        val elementalType: TextView = itemView.findViewById(R.id.character_element)
    }
}
