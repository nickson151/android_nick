package com.example.android_nick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flecha_Derecha: ImageView = findViewById(R.id.flecha_Derecha)

        flecha_Derecha.setOnClickListener {
            // Transición a la actividad de elección (activity_tabla_eleccion_app)
            val intent = Intent(this, seleccion_escenario::class.java)
            startActivity(intent)
        }

        val boton_informacion: ImageView = findViewById(R.id.boton_informacion)

        boton_informacion.setOnClickListener{

            val intent = Intent(this, informacion_App::class.java)
            startActivity(intent)
        }
    }
}