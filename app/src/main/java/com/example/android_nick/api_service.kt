package com.example.android_nick

import retrofit2.Call
import retrofit2.http.GET

data class ApiResponse(val url: String)

interface ApiService {
    @GET("jokes/random")
    fun obtenerDatos(): Call<ApiResponse>
}

