package com.example.projetoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nameText = findViewById<TextView>(R.id.nameText)
        val button = findViewById<Button>(R.id.button)

        nameText.text = ("Ola Mundo")
        button.setOnClickListener {
            Toast.makeText(this, "CLICOU NO BUTAO", Toast.LENGTH_SHORT).show()

        }

    }

}