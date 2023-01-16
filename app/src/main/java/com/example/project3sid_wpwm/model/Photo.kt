package com.example.project3sid_wpwm.model
import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("judul")
    val title: String?,
    @SerializedName("gambar")
    val thumbnail: String?,
    @SerializedName("lokasi")
    val lokasi: String?,
    @SerializedName("rating")
    val rating: String?
)