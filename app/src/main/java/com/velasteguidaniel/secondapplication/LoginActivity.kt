package com.velasteguidaniel.secondapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    lateinit var loginButton: Button
    lateinit var editTextTextUsername: EditText
    lateinit var editTextPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initializeComponents()
        allOnClick()
        fun longOperationAsync(longOperation: ()->Unit, callback: ()->Unit) {
            Thread {
                longOperation()
                callback()
            }.start()
        }
        longOperationAsync(
            longOperation = { Thread.sleep(1000L) },
            callback = { println("After one second") } //Prints after one second
        )
        println("Now")
        val email = "alex.daniel@gmail.com"
        println(email.validarEmail())
    }

    fun initializeComponents(){
        loginButton = findViewById(R.id.buttonEnter)
        editTextTextUsername = findViewById(R.id.editTextTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
    }

    fun allOnClick(){
        loginButton.setOnClickListener {
            Toast.makeText(this, "Has iniciado sesión", Toast.LENGTH_LONG).show()
            it.setBackgroundColor(Color.BLACK)
        }
        editTextTextUsername.setOnClickListener{
            Toast.makeText(this, "Aquí escriba su nombre de usuario", Toast.LENGTH_LONG).show()
            it.setBackgroundColor(Color.WHITE)
        }
        editTextPassword.setOnClickListener{
            Toast.makeText(this, "Aquí escriba su contraseña", Toast.LENGTH_SHORT).show()
            it.setBackgroundColor(Color.GRAY)
        }
    }

    fun String.validarEmail()=
        Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        ).matcher(this).matches()


}