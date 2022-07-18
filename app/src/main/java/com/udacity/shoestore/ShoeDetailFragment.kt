package com.udacity.shoestore


import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.Toast
import androidx.fragment.app.activityViewModels

import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding

import com.udacity.shoestore.models.Shoe


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

        return binding.root
    }


    private fun buttonCancelOnClick() {
        binding.cancel.setOnClickListener {
            navigate(it)
        }

    }
    private fun buttonSaveOnClick() {
        binding.appCompatButton.setOnClickListener {
            if (shoeValidation())
            {
                val shoe = Shoe(binding.editText3.text.toString(),binding.editText5.text.toString().toDouble(),
                    binding.editText4.text.toString(),binding.editText6.text.toString())
                viewModel.addShoe(shoe)

                navigate(it)
            }


        }

    }

    private fun navigate(view: View) {

        view.findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListFragment)
    }

    private  fun shoeValidation() : Boolean{
        if (binding.editText3.text.isEmpty()||binding.editText4.text.isEmpty()
            ||binding.editText5.text.isEmpty()||binding.editText6.text.isEmpty())
        {
            val text = "Please Enter All Fields"
            val duration = Toast.LENGTH_SHORT
            val applicationContext = activity
            Toast.makeText(applicationContext, text, duration).show()

            return false

        }
        return true
    }


}