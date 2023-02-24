package com.kroger.classdemoapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kroger.classdemoapp.model.Character
import com.kroger.classdemoapp.CharacterAdapter
import com.kroger.classdemoapp.R
import kotlin.random.Random
@AndroidEntryPoint
class CharacterListFragment : Fragment() {

    private var binding: FragmentCharacterListBinding? = null

    private val binding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCharacterListBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_character_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.character_recycler_view)
        binding.characterRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        //recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val characters = mutableListOf<Character>()

        val genders = mutableListOf("Male", "Female", "Pickle", "Squanch", "01010")
        val characterLocations = mutableListOf(
            "Earth",
            "Citadel of Ricks",
            "Interdimensional Cable",
            "Random Dimension"
        )
        val nameMods = mutableListOf("Pickle", "", "Smart", "Fused", "Big Arm")
        val characterNames = mutableListOf("Rick", "Morty", "Summer", "Jerry", "Beth")

        for (i in 0..30) {
            characters.add(
                createCharacter(
                    "${nameMods.random()} ${characterNames.random()}".trimStart(),
                    characterLocations.random(),
                    genders.random(),
                    i
                )
            )
        }

        val adapter = CharacterAdapter(characters)

        recyclerView.adapter = adapter

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun createCharacter(
        name: String,
        location: String,
        gender: String,
        id: Int
    ) = Character(
        name = name,
        age = Random.nextInt(10, 99),
        image = "https://rickandmortyapi.com/api/character/avatar/291.jpeg",
        gender = gender,
        universe = location,
        id = id,
        relation = listOf()
    )
}