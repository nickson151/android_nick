
package com.example.android_nick.servicesAPI

import retrofit2.Call
import retrofit2.http.GET

interface Entrevista {
    @GET("v1/images/search?limit=10")
    fun search(): Call<List<Entrevista>>

}