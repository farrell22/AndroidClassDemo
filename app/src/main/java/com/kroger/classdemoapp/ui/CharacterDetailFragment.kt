package com.kroger.classdemoapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.kroger.classdemoapp.R
@AndroidEntryPoint
class CharacterDetailFragment : Fragment() {

    private var binding: FragmentCharacterDetailBinding? = null

    private val binding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_character_detail, container, false)

        binding = FragmentCharacterDetailBinding.inflate(inflater,container,false)

        if (arguments != null) {
            val name = requireArguments().getString("name")
            val age = requireArguments().getInt("age")
            val image = requireArguments().getString("image")
            val universe = requireArguments().getString("universe")

           //view.findViewById<TextView>(R.id.character_universe).text = universe
            binding.characterUniverse.text = universe
        }

        return binding.root
       // return view
    }
}