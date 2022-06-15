package com.velasteguidaniel.secondapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    lateinit var buttonNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        buttonNext = findViewById(R.id.buttonNext)
        buttonNext.setOnClickListener{
            val scrollingViewActivityIntent = Intent(this, ScrollingViewActivity::class.java)
            startActivity(scrollingViewActivityIntent)
        }
    }
}