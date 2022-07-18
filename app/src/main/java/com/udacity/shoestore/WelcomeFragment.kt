package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController

import com.udacity.shoestore.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        buttonOnClick()
        return binding.root
    }
    private fun buttonOnClick() {
        binding.navigationButton.setOnClickListener {
            navigate(it)
        }

    }

    private fun navigate(view: View) {


            view.findNavController().navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }

    }


