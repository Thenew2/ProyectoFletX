package com.example.flext2.network



import com.example.flext2.models.vehiculomodel
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Header

interface apie {@GET("/people/holder_vehicles/2282.json")
fun Obtenercamiones(
    @Header("Content-Type")  content_type:String,
    @Header("Authorization")  Authorization:String
): Call<vehiculomodel?>?


}