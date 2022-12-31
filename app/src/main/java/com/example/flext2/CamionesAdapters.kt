package com.example.flext2

import android.content.Context
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.flext2.models.CamionData

class CamionesAdapters(private val camionesList: List<CamionData>, private val context: Context, private val onClick:Clickcamiones):
    RecyclerView.Adapter<camionesViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): camionesViewholder {
        val layoutInflater = LayoutInflater.from(parent.context)
        Log.e("entre aqui","entre aqui")
        return camionesViewholder(

            layoutInflater.inflate(
                R.layout.loscamiones,
                parent,
                false

            )

        )

    }



    override fun getItemCount(): Int {
        return camionesList.size
    }

    override fun onBindViewHolder(holder: camionesViewholder, position: Int) {
        val item = camionesList[position]
        holder.bind(item,context,position,onClick)

    }

}