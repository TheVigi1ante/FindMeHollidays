com.example.findmehollidays

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase

class Anketka6 : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anketka6)

        button = findViewById(R.id.ghgi)
        editText1 = findViewById(R.id.wsaq)
        editText2 = findViewById(R.id.ogrokj)
        editText3 = findViewById(R.id.wjyd)

        button.setOnClickListener {
            //val database: FirebaseDatabase = FirebaseDatabase.getInstance()
            //val myRef1: DatabaseReference = database.getReference("Улица")
            //val myRef2: DatabaseReference = database.getReference("Дом")
            //val myRef3: DatabaseReference = database.getReference("Квартира")
            //myRef1.setValue(editText1.text.toString())
            //myRef2.setValue(editText2.text.toString())
            //myRef3.setValue(editText3.text.toString())

            val intent: Intent = Intent(this, Anketka7::class.java)
            startActivity(intent)
        }
    }
}