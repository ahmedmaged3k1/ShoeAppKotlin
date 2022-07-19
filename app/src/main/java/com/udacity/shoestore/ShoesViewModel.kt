package com.udacity.shoestore


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoesViewModel: ViewModel() {
    val shoesList  = MutableLiveData<ArrayList<Shoe>>()
    var shoeName = MutableLiveData<String>()
    var shoeDescription = MutableLiveData<String>()
    var shoeCompany = MutableLiveData<String>()
    var shoeSize = MutableLiveData<String>()
    private var shoesArrayList = ArrayList<Shoe>()


    fun addShoe()
    {
         val shoe = Shoe(shoeName.value.toString(),shoeSize.value.toString().toDouble(),shoeCompany
             .value.toString(),shoeDescription.value.toString())
        shoesArrayList.add(shoe)
        shoesList.value=shoesArrayList
        shoeName.value=""
        shoeSize.value=""
        shoeDescription.value=""
        shoeCompany.value=""

    }


}