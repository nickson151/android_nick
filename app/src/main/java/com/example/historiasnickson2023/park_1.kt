package com.example.historiasnickson2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class park_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park1)

        val flecha_derecha: ImageView = findViewById(R.id.flecha_derecha)

        flecha_derecha.setOnClickListener{
            val intent = Intent(this, park_2::class.java)
            startActivity(intent)
        }


    }
}