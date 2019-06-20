package com.example.multipantallas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PantallaTres : AppCompatActivity() {
    private var text: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_tres)
        text = findViewById<TextView>(R.id.textView8)
        recuperarDatos()
    }

    private fun recuperarDatos() {
        var recuperar = intent.extras
        var texto = recuperar.get("texto03")
        text?.append("Bienvenido $texto a la pantalla numero 3")
    }
}
