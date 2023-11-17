package com.example.android_nick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class seleccion_escenario_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_escenario2)

        val boton_atras: ImageView = findViewById(R.id.boton_atras)

        boton_atras.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val flecha_derecha: ImageView = findViewById(R.id.flecha_derecha)

        flecha_derecha.setOnClickListener{
            val intent = Intent(this, gym_1::class.java)  // colocar a donde llega derecha Main D
            startActivity(intent)
        }

        val opcion_escenario_1: ImageView = findViewById(R.id.opcion_escenario_1)

        opcion_escenario_1.setOnClickListener{
            val intent = Intent(this, seleccion_escenario::class.java)
            startActivity(intent)
        }

        val opcion_escenario_2:  ImageView = findViewById(R.id.opcion_escenario_2)

        opcion_escenario_2.setOnClickListener{
            val intent = Intent(this, seleccion_escenario_2::class.java)  // colocar a donde llega derecha Main D
            startActivity(intent)
        }


        val opcion_escenario_3: ImageView = findViewById(R.id.opcion_escenario_3)

        opcion_escenario_3.setOnClickListener{
            val intent = Intent(this, seleccion_escenario_3::class.java)  // colocar a donde llega derecha Main D
            startActivity(intent)
        }

        val opcion_escenario_4: ImageView = findViewById(R.id.opcion_escenario_4)

        opcion_escenario_4.setOnClickListener{
            val intent = Intent(this, seleccion_escenario_4::class.java)  // colocar a donde llega derecha Main D
            startActivity(intent)
        }
    }
}