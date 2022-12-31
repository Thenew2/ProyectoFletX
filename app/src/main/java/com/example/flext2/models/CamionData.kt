package com.example.flext2.models
import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2022 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class CamionData (

	@SerializedName("id") val id : Int,
	@SerializedName("owner") val owner : Owner,
	@SerializedName("holder") val holder : Holder,
	@SerializedName("driver") val driver : Driver,
	@SerializedName("placa") val placa : String,
	@SerializedName("carmark") val carmark : Carmark,
	@SerializedName("carline") val carline : Carline,
	@SerializedName("carcolor") val carcolor : Carcolor,
	@SerializedName("cartype") val cartype : Cartype,
	@SerializedName("model") val model : Int,
	@SerializedName("repowering") val repowering : Int,
	@SerializedName("fuel") val fuel : Fuel,
	@SerializedName("carconfig") val carconfig : Carconfig,
	@SerializedName("maximum_weight") val maximum_weight : Int,
	@SerializedName("empty_weight") val empty_weight : Int,
	@SerializedName("load_capacity") val load_capacity : Int,
	@SerializedName("status") val status : Int,
	@SerializedName("lonlat") val lonlat : String,
	@SerializedName("front_vehicle") val front_vehicle : Front_vehicle,
	@SerializedName("picture_panoramic_vehicle") val picture_panoramic_vehicle : Picture_panoramic_vehicle,
	@SerializedName("rear_vehicle") val rear_vehicle : Rear_vehicle,
	@SerializedName("front_ownership_card") val front_ownership_card : Front_ownership_card,
	@SerializedName("back_ownership_card") val back_ownership_card : Back_ownership_card,
	@SerializedName("photo_tecnomecanica") val photo_tecnomecanica : Photo_tecnomecanica,
	@SerializedName("insurance_poliy") val insurance_poliy : Insurance_poliy,
	@SerializedName("soat_photo") val soat_photo : Soat_photo,
	@SerializedName("vehicle_workshop") val vehicle_workshop : Vehicle_workshop,
	@SerializedName("thirdstate_id") val thirdstate_id : Int,
	@SerializedName("thirdstate") val thirdstate : Thirdstate,
	@SerializedName("is_owner") val is_owner : Boolean,
	@SerializedName("is_own_treatment") val is_own_treatment : Boolean,
	//@SerializedName("profile") val profile : Profile,
	@SerializedName("satellite_provider_id") val satellite_provider_id : String,
	//@SerializedName("satellite_provider") val satellite_provider : String? = null,
	@SerializedName("username") val username : String? = null,
	@SerializedName("password") val password : String,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("updated_at") val updated_at : String,
	@SerializedName("has_gps_fletx") val has_gps_fletx : Boolean,
	@SerializedName("trailer") val trailer : Trailer? = null,
	@SerializedName("url") val url : String
)