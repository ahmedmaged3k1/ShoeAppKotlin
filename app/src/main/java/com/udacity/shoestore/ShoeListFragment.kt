package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentShoeListBinding.inflate(inflater, container, false)
        buttonOnClick()
        return binding.root
    }
    private fun buttonOnClick() {
        binding.addShoe.setOnClickListener {
            navigate(it)
        }

    }

    private fun navigate(view: View) {

        view.findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailFragment)
    }

}