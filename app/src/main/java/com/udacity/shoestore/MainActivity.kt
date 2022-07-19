package com.udacity.shoestore


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.udacity.shoestore.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit  var   binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Timber.plant(Timber.DebugTree())
        setSupportActionBar(toolbar)
    }

}
