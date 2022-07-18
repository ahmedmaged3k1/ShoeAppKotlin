package com.udacity.shoestore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import android.view.MenuItem

import com.udacity.shoestore.databinding.ActivityMainBinding

import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit  var   binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Timber.plant(Timber.DebugTree())

        //val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)as NavHostFragment
       // navController = navHostFragment.findNavController()
        setSupportActionBar(binding.toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this,MainActivity::class.java)
        when(item.itemId){

            R.id.loginFragment -> startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }
}
