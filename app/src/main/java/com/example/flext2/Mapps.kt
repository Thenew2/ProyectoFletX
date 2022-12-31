package com.example.flext2
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.StreetViewPanorama
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Mapps : AppCompatActivity(), OnMapReadyCallback{
    private lateinit var map:GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapconfing)
        createMapFragment()
        var datamapUsername = getIntent().getExtras()?.getString("username");
        var datamapPlaca = getIntent().getExtras()?.getString("placa");
        var datamapTrailerplaca = getIntent().getExtras()?.getString("trailer.placa");
        var datamapthirdstatename = getIntent().getExtras()?.getString("thirdstate.name");
        var datamappoint = getIntent().getExtras()?.getString("point");
        camionesmap = Camiones(1,datamapPlaca!!, datamapUsername,datamapTrailerplaca,datamapthirdstatename!!,"")
        autposition = datamappoint!!


    }
    var camionesmap: Camiones? = null

    private fun createMapFragment() {
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.fragmentMap) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    var autposition = ""

    override fun onMapReady(googleMap: GoogleMap) {
            val split = autposition.split(" ")
            val long = split[1].replace("(", "").toDouble()
            val lat = split[2].replace(")", "").toDouble()
        map = googleMap
        val favoritePlace = LatLng(lat,long)
        map.addMarker(MarkerOptions().position(favoritePlace).title("Se encuentra aqui"))
        map.animateCamera(
            CameraUpdateFactory.newLatLngZoom(favoritePlace, 18f),
            4000,
            null

        )
        map.setInfoWindowAdapter(InfoWindowVehicle(this,camionesmap!!))
    }
}