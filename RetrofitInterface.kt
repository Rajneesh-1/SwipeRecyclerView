package com.smartherd.recyclerviewdemo

import com.smartherd.recyclerviewdemo.models.RetrofitModel
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @GET("posts")
    fun getData(): Call<List<RetrofitModel>>
}