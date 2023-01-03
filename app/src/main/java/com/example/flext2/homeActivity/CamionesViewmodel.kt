package com.example.flext2.homeActivity


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

import com.example.flext2.models.vehiculomodel
import com.example.flext2.network.repositorio

class CamionesViewmodel : ViewModel() {
    //Services API
    private var camionesrepository: repositorio? = null
    private var Getcamioneslivedata: LiveData<vehiculomodel>? = null
    init {
        camionesrepository = repositorio()
        Getcamioneslivedata = camionesrepository!!.GetVehiculoslivedata()

    }
    fun obtenerVehiculos(){
        camionesrepository!!.Getcamiones()
    }
    fun GetVehiculoslivedata(): LiveData<vehiculomodel>? {
        return Getcamioneslivedata
    }

}