package com.example.findmehollidays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Anketka3 : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anketka3)

        button = findViewById(R.id.ginbfghgi)

        button.setOnClickListener {
            val intent: Intent = Intent(this, Anketka4::class.java)
            startActivity(intent)
        }
    }
}