package com.kroger.classdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val personas = mutableListOf<Persona>()

        for (i in 0..30) {
            personas.add(createPersona())
        }

        val adapter = PersonaAdapter(personas)
        recyclerView.adapter = adapter
    }

    private fun createPersona() = Persona(
        name = "Orpheus",
        starting_level = 1,
        arcana = "Fool",
        cultural_origin = "Greco-Roman",
        weaknesses = listOf()
    )
}
