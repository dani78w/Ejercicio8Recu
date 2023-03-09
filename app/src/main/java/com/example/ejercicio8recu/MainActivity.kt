package com.example.ejercicio8recu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selected = 0
        var personaje = Personaje()

        var imagen: ImageView = findViewById(R.id.imageButton)
        var magoButton: Button = findViewById(R.id.magoButton)
        var ladronButton: Button = findViewById(R.id.ladronButton)
        var guerreroButton: Button = findViewById(R.id.guerreroButton)
        var berserkerButton: Button = findViewById(R.id.berserkerButton)
        var siguienteButton: Button = findViewById(R.id.siguienteB)

        magoButton.setOnClickListener {
            imagen.setImageResource(R.drawable.mago)
            personaje.raza = "mago"
        }
        ladronButton.setOnClickListener {
            imagen.setImageResource(R.drawable.ladron)
            personaje.raza = "ladron"
        }
        guerreroButton.setOnClickListener {
            imagen.setImageResource(R.drawable.guerrero)
            personaje.raza = "guerrero"
        }
        berserkerButton.setOnClickListener {
            imagen.setImageResource(R.drawable.berserk)
            personaje.raza = "berserker"
        }

        siguienteButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("personaje", personaje)
            startActivity(intent)
        }



    }
}