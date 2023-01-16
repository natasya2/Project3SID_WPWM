package com.example.project3sid_wpwm.api

import com.example.project3sid_wpwm.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("data")
    fun getPhotos(): Single<List<Photo>>
}

