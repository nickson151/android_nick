package com.example.historiasnickson2023

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.historiasnickson2023.databinding.ActivityApiGymBinding // Importa la clase de View Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class api_gym : AppCompatActivity() {
    private val baseUrl = "https://api.chucknorris.io/"
    private lateinit var apiService: ApiService
    private lateinit var binding: ActivityApiGymBinding // Declara una variable para el objeto View Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializa el objeto View Binding
        binding = ActivityApiGymBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Configura Retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // Crea una instancia de la interfaz que define las llamadas a la API
        apiService = retrofit.create(ApiService::class.java)

        // Realiza una solicitud GET al cargar la actividad
        realizarSolicitudApi()

        // Agrega un botón para realizar otra solicitud
        binding.botonCambiarImagen.setOnClickListener {
            realizarSolicitudApi()
        }
    }

    private fun realizarSolicitudApi() {
        val call = apiService.obtenerDatos()

        call.enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>, response: Response<ApiResponse>) {
                if (response.isSuccessful) {
                    val data = response.body()
                    // Aquí puedes procesar la respuesta de la API según tus necesidades

                } else {
                    // Manejar una respuesta no exitosa aquí si es necesario
                }
            }

            override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                // Manejar un error de solicitud aquí si es necesario
            }
        })
    }
}
