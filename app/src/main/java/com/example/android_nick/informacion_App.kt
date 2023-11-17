package com.example.android_nick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class informacion_App : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion_app)

        val opcion_home: ImageView = findViewById(R.id.opcion_home)

        opcion_home.setOnClickListener {
            // Transición a la actividad de elección (activity_tabla_eleccion_app)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val flecha_derecha_info:ImageView= findViewById(R.id.flecha_derecha_info)

        flecha_derecha_info.setOnClickListener{
            val intent = Intent(this, seleccion_escenario::class.java)
            startActivity(intent)

        }

    }
}