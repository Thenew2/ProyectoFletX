package com.example.flext2.homeActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flext2.Map.Mapps
import com.example.flext2.R
import com.example.flext2.databinding.ActivityMainBinding
import com.example.flext2.models.CamionData

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    private lateinit var viewmodel:CamionesViewmodel
    //private lateinit var binding: MainActiv
    private var adapterscamiones: CamionesAdapters? = null
    var unalista: MutableList<CamionData> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        viewmodel = ViewModelProvider(this).get(CamionesViewmodel::class.java)
        viewmodel.obtenerVehiculos()
        viewmodel.GetVehiculoslivedata()!!.observe(this){
            unalista.clear()
            unalista.addAll(it.data)
            adapterscamiones!!.notifyDataSetChanged()




            Log.e("prueba","GetVehiculosLiveData"+it)
        }
        initresicleview()


    }


    private fun initresicleview(){


        adapterscamiones = CamionesAdapters(unalista,this,object : Clickcamiones {
            override fun onClick(position: Int) {
            var element = unalista[position]
                iralmapa(element)

            }


        })
            binding!!.recycleview.layoutManager = LinearLayoutManager(this)
            binding!!.recycleview.adapter = adapterscamiones
        }
     fun iralmapa(vehicle:CamionData){
        val ventanamain: Intent = Intent(this, Mapps::class.java).apply {  }
        ventanamain.putExtra("username",vehicle.username) ?: getString(R.string.not_trailer)
        ventanamain.putExtra("placa",vehicle.placa)
        ventanamain.putExtra("trailer.placa",vehicle.trailer?.placa) ?: "sin trailer"
        ventanamain.putExtra("thirdstate.name",vehicle.thirdstate.name)
        ventanamain.putExtra("point",vehicle.lonlat)
        startActivity(ventanamain)
    }




}










