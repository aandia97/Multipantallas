package com.example.multipantallas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var entrada01 : EditText? = null
    private var entrada02 : EditText? = null
    private var entrada03 : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        entrada01 = findViewById<EditText>(R.id.editText)
        entrada02 = findViewById<EditText>(R.id.editText2)
        entrada03 = findViewById<EditText>(R.id.editText3)
    }

    fun lanzarPantalla(view:View){

        val lanzador = Intent(this,PantallaUno::class.java)
        lanzador.putExtra("texto01", entrada01?.text.toString())
        startActivity(lanzador)

    }
    fun lanzadorPantalla2(view: View){
        val lanzador2 = Intent(this,PantallaDos::class.java)
        lanzador2.putExtra("texto02", entrada02?.text.toString())
        startActivity(lanzador2)
    }
    fun lanzadorPantalla3(view: View){
        val lanzador3 = Intent(this,PantallaTres::class.java)
        lanzador3.putExtra("texto03", entrada03?.text.toString())
        startActivity(lanzador3)
    }



}
