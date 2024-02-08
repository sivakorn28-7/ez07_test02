package com.example.ez07_test02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txttest02: TextView = findViewById(R.id.txttest02)
        val quizbt: Button = findViewById(R.id.quizbt)
        val calbt: Button = findViewById(R.id.calbt)
        val loginbt: Button = findViewById(R.id.loginbt)

        quizbt.setOnClickListener {

            val intent = Intent().apply {
                setClassName("com.example.ez04work01", "com.example.ez04work01.MainActivity")
            }
            startActivity(intent)
        }

        calbt.setOnClickListener {
            val intent = Intent().apply {
                setClassName("com.example.ez_calculator", "com.example.ez_calculator.MainActivity")
            }
            startActivity(intent)
        }

        loginbt.setOnClickListener {
            val intent = Intent().apply {
                setClassName("com.example.ez05_firebase", "com.example.ez05_firebase.Signup")
            }
            startActivity(intent)
        }
    }
}
