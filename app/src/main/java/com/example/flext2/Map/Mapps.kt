package com.example.flext2.Map
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flext2.InfoWindowVehicle
import com.example.flext2.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Mapps : AppCompatActivity(), OnMapReadyCallback{
    private lateinit var map:GoogleMap
    var camionesmap: Camiones? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapconfing)
        createMapFragment()
        var datamapUsername = getIntent().getExtras()?.getString("username");
        var datamapPlaca = getIntent().getExtras()?.getString("placa");
        var datamapTrailerplaca = getIntent().getExtras()?.getString("trailer.placa");
        var datamapthirdstatename = getIntent().getExtras()?.getString("thirdstate.name");
        var datamappoint = getIntent().getExtras()?.getString("point");
        camionesmap = Camiones(datamapPlaca!!, datamapUsername,datamapTrailerplaca,datamapthirdstatename!!,datamappoint)

    }


    private fun createMapFragment() {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentMap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
            val split = camionesmap.autposition.split(" ")
            val long = split[1].replace("(", "").toDouble()
            val lat = split[2].replace(")", "").toDouble()
        map = googleMap
        val Vehicleplace = LatLng(lat,long)
        map.addMarker(MarkerOptions().position(Vehicleplace))
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(Vehicleplace, 18f),
            4000,
            null

        )
        map.setInfoWindowAdapter(InfoWindowVehicle(this,camionesmap!!))
    }
}