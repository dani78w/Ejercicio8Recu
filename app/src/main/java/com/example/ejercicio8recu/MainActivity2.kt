package com.example.ejercicio8recu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var text: TextView = findViewById(R.id.claseText)
        var pers = intent.getSerializableExtra("personaje") as Personaje
        text.text = pers.raza    }
}