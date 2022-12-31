package com.example.flext2

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import androidx.core.view.size
import java.util.*

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flext2.databinding.LoscamionesBinding
import com.example.flext2.models.CamionData

class camionesViewholder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = LoscamionesBinding.bind(view)
    @SuppressLint("SetTextI18n")
    fun bind(item: CamionData,context:Context,position: Int,listener: Clickcamiones){
        binding.placaTrailer.text = item.trailer?.placa ?:"sin trailer"
        binding.estatusVehiculo.text = item.thirdstate.name
        binding.nameConductor.text = item.username?:"sin conductor"
        binding.placaVehiculo.text = item.placa
        Glide.with(context)
            .load(item.front_vehicle.url?.replace("prueba", "staging"))
            .into(binding.imgFoto)
        binding.root.setOnClickListener{
            listener.onClick(position)
        }







    }
}