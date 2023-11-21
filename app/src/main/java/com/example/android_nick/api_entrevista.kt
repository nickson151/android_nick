package com.example.android_nick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_nick.servicesAPI.Entrevista
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*class api_entrevista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_entrevista)

        fun loadEntrevista(){
            val context = getApplication<Aplication>().applicationContext
            var retrofit = Retrofit.Builder()
                .baseUrl("https://api.thecatapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val api = retrofit.create(Entrevista::class.java)
            val search = api.search()
            search.enqueue(object: Callback<List<Entrevista>> {
                override fun onResponse(call: Call<List<Entrevista>>){
                    TODO(reason: "Api fine")
                }
                override fun onFailure(call: Call<List<Entrevista>> t:Throwable){
                    TODO(reason: "ERROR API ")


                }

            })
        }
    }
}*/