package com.udacity.shoestore

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    private lateinit var viewModel: ShoesViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentShoeListBinding.inflate(inflater, container, false)
        buttonOnClick()
        viewModel = ViewModelProvider(this).get(ShoesViewModel::class.java)

        return binding.root
    }
    private fun createViews(){
        Log.d(TAG, "createViews: tets "+viewModel.shoesList.value.toString() )
        viewModel.shoesList.observe(viewLifecycleOwner, Observer {
        //   Log.d(TAG, "createViews asd: "+it.)

        })
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