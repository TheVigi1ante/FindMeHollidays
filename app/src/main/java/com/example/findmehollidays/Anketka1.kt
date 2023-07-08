package com.example.findmehollidays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import com.example.findmehollidays.com.example.findmehollidays.Anketka2

class Anketka1 : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anketka1)

        checkBox = findViewById(R.id.ffccc)
        button = findViewById(R.id.gingi)

        button.setOnClickListener {
            if (checkBox.isChecked) {
                val intent: Intent = Intent(this, Anketka2::class.java)
                startActivity(intent)
            } else {
                showDialogWindow()
            }
        }
    }

    private fun showDialogWindow() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title)
        builder.setMessage(R.string.dffwe)
        builder.setNeutralButton(R.string.OK){dialogInterface, i ->}
        builder.show()
    }
}