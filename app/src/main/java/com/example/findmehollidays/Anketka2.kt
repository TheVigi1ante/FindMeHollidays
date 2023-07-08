package com.example.findmehollidays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Anketka2 : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anketka2)

        button = findViewById(R.id.zginbfghgi)

        button.setOnClickListener {

            val intent: Intent = Intent(this, Anketka3::class.java)
            startActivity(intent)
        }
    }
}