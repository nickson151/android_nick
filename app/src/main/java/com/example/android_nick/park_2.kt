package com.example.android_nick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class park_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park2)

        val flecha_derecha: ImageView = findViewById(R.id.flecha_derecha)

        flecha_derecha.setOnClickListener{
            val intent = Intent(this, park_3::class.java)
            startActivity(intent)
        }
    }
}