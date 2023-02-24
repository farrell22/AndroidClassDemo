package com.kroger.classdemoapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kroger.classdemoapp.databinding.CharacterCardViewBinding
import kotlin.random.Random

class CharacterAdapter(
    private val characters: List<Character>),
    private val onItemClick:(adapterPosition: Int) -> Unit

): RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CharacterViewHolder(
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = CharacterCardViewBinding.inflate(layoutInflater, parent, false)

    //    LayoutInflater.from(parent.context)
      //      .inflate(R.layout.character_card_view, parent, false)
    return CharacterViewHolder(view) { position ->
    )

    override fun onBindViewHolder(holder.
        val character = characters[position]
        Glide
                .with(holder.itemView.context)
            .load(character.image)
            .into(holder.characterImage)

        holder: CharacterViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }

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

    class CharacterViewHolder(binding: CharacterCardViewBinding/*itemView:View*/) : RecyclerView.ViewHolder(binding.root/*itemView*/) {
        private val CharacterCardViewBinding
        val characterImage: ImageView = itemView.findViewById(R.id.character_image)
        val characterName: TextView = itemView.findViewById(R.id.character_name)
        val characterStartingLevel: TextView = itemView.findViewById(R.id.character_startingLevel)
        val characterRegion:TextView = itemView.findViewById(R.id.character_region)
        val pokedexNumber: TextView = itemView.findViewById(R.id.character_pokedex)
        val elementalType: TextView = itemView.findViewById(R.id.character_element)
    }

    fun bind(character: Character) {
        Glide
            .with(binding.root)
            .load(character.image)
            .into(holder.characterImage)

        binding.characterName.text = character.name
        binding.characterAge.text = character.age.toString()
        //holder.characterName.text = holder.itemView.context.getString(R.string.name, character.name)
        //holder.characterAge.text = character.age.toString()
    }
}
