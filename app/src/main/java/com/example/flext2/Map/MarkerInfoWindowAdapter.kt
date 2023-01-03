package com.example.flext2
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.flext2.Map.Camiones
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker


class InfoWindowVehicle(private val mContext: Context, private val vehicle: Camiones) :
    GoogleMap.InfoWindowAdapter {

    override fun getInfoContents(p0: Marker): View? {
        actualizarui()
        return mWindow

    }

    override fun getInfoWindow(p0: Marker): View? {
        actualizarui()
        return mWindow
    }
    var mWindow: View = LayoutInflater.from(mContext).inflate(R.layout.marker_info_contents, null)

    private fun actualizarui(){
        mWindow.findViewById<TextView>(R.id.placaTrailerMap).text = vehicle.placaTrailer
        mWindow.findViewById<TextView>(R.id.nombreMap).text = vehicle?.nombreConductor
        mWindow.findViewById<TextView>(R.id.placaMap).text = vehicle?.placaVehiculo
        mWindow.findViewById<TextView>(R.id.mapEstado).text = vehicle?.estatusVehiculo
    }

}