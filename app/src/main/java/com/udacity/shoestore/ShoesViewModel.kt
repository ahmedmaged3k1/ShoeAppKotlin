package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoesViewModel: ViewModel() {
    private  val _shoesList  = MutableLiveData<Shoe>()
    val shoesList : LiveData<Shoe>
    get() = _shoesList
}