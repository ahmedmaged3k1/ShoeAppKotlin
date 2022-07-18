package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoesViewModel: ViewModel() {
      var shoesList  = MutableLiveData<Shoe>()
    init {

    }
    fun addShoe(shoe: Shoe)
    {
        shoesList.value=shoe
    }


}