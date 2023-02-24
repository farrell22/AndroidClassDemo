package com.kroger.classdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kroger.classdemoapp.databinding.ActivityMainBinding
import com.kroger.classdemoapp.model.Character
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.character_card_view)
        /*
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, CharacterListFragment())
        }
*/
        /*
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(binding.fragmentContainerView, CharacterListFragment())
            addToBackStack(null)
        }

         */
        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val characters = mutableListOf<Character>()

        for (i in 0..30) {
            characters.add(createCharacter())
        }

        val adapter = CharacterAdapter(characters)
        recyclerView.adapter = adapter
    }

    private fun createCharacter() = Character(
        name = "Pidgey",
        startingLevel = Random.nextInt(10, 99),
        image = R.drawable.baseline_10k_24,
        region = "Kanto",
        pokedexNumber = 0,
        elementalType = "Normal"
    )
}
