package com.example.getphoto1.api

import com.example.getphoto1.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
//    @GET("photos")
    @GET("comments")
    fun getPhotos(): Single<List<Photo>>
}