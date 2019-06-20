package com.example.multipantallas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View as View

class PantallaUno : AppCompatActivity() {
    private var text : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_uno)
        text = findViewById<TextView>(R.id.textView4)
        recuperarDatos()

    }
    fun recuperarDatos(){
        var recuperar = intent.extras
        var texto = recuperar.get("texto01")
        text?.append("Bienvenido $texto a la pantalla numero 1")
    }
}
