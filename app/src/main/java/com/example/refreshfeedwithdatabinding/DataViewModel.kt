package com.example.refreshfeedwithdatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    val data = MutableLiveData<String>()

    fun setData(newData: String){
        data.value = newData
    }
}