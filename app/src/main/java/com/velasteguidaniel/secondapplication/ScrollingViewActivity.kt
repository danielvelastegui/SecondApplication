package com.velasteguidaniel.secondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val TAG_LOG = "CICLOVIDA"

class ScrollingViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling_view)

        val mensaje = "En el evento onCreate()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        val editTextDatos = findViewById<EditText>(R.id.editTextDatos)
        val textViewMostrarTexto = findViewById<TextView>(R.id.textViewMostrarTexto)
        val buttonGuardar = findViewById<Button>(R.id.buttonGuardar)
        val buttonLimpiar = findViewById<Button>(R.id.buttonLimpiar)
        buttonGuardar.setOnClickListener {
            textViewMostrarTexto.text = editTextDatos.text
            finish()
        }
        buttonLimpiar.setOnClickListener {
            textViewMostrarTexto.text = ""
            editTextDatos.setText("")
        }
    }


    override fun onStart() {
        super.onStart()
        val mensaje = "En el evento onStart()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        val mensaje = "En el evento onResume()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        val mensaje = "En el evento onPause()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        val mensaje = "En el evento onStop()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val mensaje = "En el evento onDestroy()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        val mensaje = "En el evento onRestart()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}