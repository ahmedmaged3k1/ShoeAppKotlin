package com.udacity.shoestore



import android.os.Bundle


import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



import androidx.fragment.app.activityViewModels

import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding




class ShoeDetailFragment : Fragment() {



    private lateinit var binding: FragmentShoeDetailBinding
    private  val viewModel: ShoesViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment


        binding = FragmentShoeDetailBinding.inflate(inflater, container, false)
        buttonCancelOnClick()
        buttonSaveOnClick()
        binding.shoeList=viewModel
        binding.lifecycleOwner =this
        return binding.root
    }


    private fun buttonCancelOnClick() {
        binding.cancel.setOnClickListener {
            navigate(it)
        }

    }
    private fun buttonSaveOnClick() {
        binding.appCompatButton.setOnClickListener {
                viewModel.addShoe()
                navigate(it)
        }

    }

    private fun navigate(view: View) {

        view.findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
    }



}