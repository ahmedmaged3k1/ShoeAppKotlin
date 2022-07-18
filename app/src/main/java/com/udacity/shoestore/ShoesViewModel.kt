package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoesViewModel: ViewModel() {
    val shoesList  = MutableLiveData<ArrayList<Shoe>>()
    var shoesArrayList = ArrayList<Shoe>()

    init {

    }
    fun addShoe(shoe: Shoe)
    {
        shoesArrayList.add(shoe)
        shoesList.value=shoesArrayList
    }


}