package com.udacity.shoestore



import android.os.Bundle
import android.view.*

import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer


import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import com.udacity.shoestore.databinding.FragmentShoeListBinding


class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    private  val viewModel: ShoesViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentShoeListBinding.inflate(inflater, container, false)
        buttonOnClick()
        createViews()
       // Log.d(TAG, "Testing : size  "+ (viewModel.shoesList.value?.get(0)?.company ?: 258))
        setHasOptionsMenu(true)
            return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu,menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        NavigationUI.onNavDestinationSelected(item,view!!.findNavController())
        return super.onOptionsItemSelected(item)
    }


    private fun createViews(){

        viewModel.shoesList.observe(viewLifecycleOwner, Observer {
            for (i in 0 until it.size)
            {
                val name = TextView(this.context)
                name.text= it[i].name
                val company = TextView(this.context)
                company.text= it[i].company
                val size = TextView(this.context)
                size.text= it[i].size.toString()
                val description = TextView(this.context)
                description.text= it[i].description
                binding.linearLayout.addView(name)
                binding.linearLayout.addView(company)
                binding.linearLayout.addView(size)
                binding.linearLayout.addView(description)



            }

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