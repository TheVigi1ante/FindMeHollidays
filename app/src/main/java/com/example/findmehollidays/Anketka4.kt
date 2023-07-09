com.example.findmehollidays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase

class Anketka4 : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anketka4)

        button = findViewById(R.id.gsinbfghgi)
        editText = findViewById(R.id.qwevgjcsogoj)

        button.setOnClickListener {
            //val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            //val myRef: DatabaseReference = database.getReference("Город")
            //myRef.setValue(editText.text.toString())

            val intent: Intent = Intent(this, Anketka5::class.java)
            startActivity(intent)
        }
    }
}