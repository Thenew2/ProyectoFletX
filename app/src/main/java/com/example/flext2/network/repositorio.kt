package com.example.flext2.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.flext2.models.vehiculomodel
import com.example.flext2.retro
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class repositorio {
    private val ApiClientcamiones: apie
    private var GetCamionesLiveData: MutableLiveData<vehiculomodel>? = null

    init {
        val retrofit = retro.RetrofitHelper().getRetrofit()
        ApiClientcamiones = retrofit.create(apie::class.java)
        GetCamionesLiveData = MutableLiveData()
    }
    fun Getcamiones() {
        ApiClientcamiones.Obtenercamiones("application/json", "Bearer ab11cb7605a030ee350d08f805057413")
            ?.enqueue(object : Callback<vehiculomodel?> {
                override fun onResponse(
                    call: Call<vehiculomodel?>,
                    response: Response<vehiculomodel?>
                ) {
                    if (response.body() != null) {
                        Log.e("error","no fue nulo")
                        GetCamionesLiveData!!.postValue(response.body())

                    } else {
                        Log.e("error","nulo")
                        GetCamionesLiveData!!.postValue(null)

                    }
                }

                override fun onFailure(
                    call: Call<vehiculomodel?>,
                    t: Throwable
                ) {
                    Log.e("error","fue failure")
                    GetCamionesLiveData!!.postValue(null)
                }
            })

    }
    fun GetVehiculoslivedata(): LiveData<vehiculomodel>? {
        return GetCamionesLiveData
    }
}