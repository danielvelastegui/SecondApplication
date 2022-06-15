package com.velasteguidaniel.secondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ScrollingViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling_view)

        val editTextDatos = findViewById<EditText>(R.id.editTextDatos)
        val textViewMostrarTexto = findViewById<TextView>(R.id.textViewMostrarTexto)
        val buttonGuardar = findViewById<Button>(R.id.buttonGuardar)
        val buttonLimpiar = findViewById<Button>(R.id.buttonLimpiar)
        buttonGuardar.setOnClickListener {
            textViewMostrarTexto.text = editTextDatos.text
        }
        buttonLimpiar.setOnClickListener {
            textViewMostrarTexto.text = ""
            editTextDatos.setText("")
        }
    }
}