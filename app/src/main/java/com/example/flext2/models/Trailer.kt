package com.example.flext2.models
import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2022 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class Trailer (

	@SerializedName("id") val id : Int,
	@SerializedName("placa") val placa : String? = null,
	@SerializedName("model") val model : Int,
	@SerializedName("maximum_weight") val maximum_weight : Int,
	@SerializedName("empty_weight") val empty_weight : Int,
	@SerializedName("picture") val picture : Picture,
	@SerializedName("front_card") val front_card : Front_card,
	@SerializedName("back_card") val back_card : Back_card,
	@SerializedName("trailermark") val trailermark : Trailermark,
	@SerializedName("trailermark_id") val trailermark_id : Int,
	@SerializedName("carcolor_id") val carcolor_id : Int,
	@SerializedName("vehicle_id") val vehicle_id : Int,
	@SerializedName("owner_id") val owner_id : Int,
	@SerializedName("holder_id") val holder_id : Int,
	@SerializedName("num_axes") val num_axes : Int,
	@SerializedName("cartype_id") val cartype_id : Int,
	@SerializedName("cartype") val cartype : Cartype
)