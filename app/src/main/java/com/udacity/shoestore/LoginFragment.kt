package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        buttonOnClick()
        return binding.root
    }

    private fun buttonOnClick() {
        binding.loginButton.setOnClickListener {
            navigate(it)
        }
        binding.signUpButton.setOnClickListener {

            navigate(it)

        }
    }

    private fun navigate(view: View) {
        if (loginValidation())
        {
            view.findNavController().navigate(R.id.action_loginFragment_to_welcomeFragment)
        }

    }
    private  fun loginValidation() : Boolean{
        if (binding.editText.text.isEmpty()||binding.editText2.text.isEmpty())
        {
            val text = "Please Enter Email Or Password"
            val duration = Toast.LENGTH_SHORT
            val applicationContext = activity
            Toast.makeText(applicationContext, text, duration).show()

            return false

        }
        return true
    }


}