package com.example.historiasnickson2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.http.GET

data class ApiResponse(val url: String)

interface ApiService {
    @GET("jokes/random")
    fun obtenerDatos(): Call<ApiResponse>
}

