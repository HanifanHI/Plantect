package com.hanifan.bigproject.network.responsemodel
import com.google.gson.annotations.SerializedName

data class Default (

    @SerializedName("Nama_Tanaman")
    var nm_tmn:String?,
    @SerializedName("Jenis_Tanaman")
    var jns_tmn:String?,
    @SerializedName("Deskripsi")
    var deskripsi:String?,
    @SerializedName("Nutrisi")
    var nutrisi:String?,
    @SerializedName("Manfaat")
    var manfaat:String?,

)