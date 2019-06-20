package com.example.multipantallas

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_pantalla_dos.*

class PantallaDos : AppCompatActivity() {
    private var text: TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_dos)
        setSupportActionBar(toolbar)
        text = findViewById<TextView>(R.id.textView6)
        recuperarDatos()
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
    fun recuperarDatos(){
        var recuperar = intent.extras
        var texto = recuperar.get("texto02")
        text?.append("Bienvenido $texto a la pantalla numero 2")
    }

}
