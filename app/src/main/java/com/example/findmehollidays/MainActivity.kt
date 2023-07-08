package com.example.findmehollidays

import android.content.Intent
import android.content.pm.PackageManager
import android.net.wifi.WifiInfo
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
//import com.google.firebase.database.DatabaseReference
//import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var button_l_t: ImageButton
    private lateinit var button_fake: ImageButton
    private lateinit var button_anketka: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_l_t = findViewById(R.id.button_l_t)
        button_fake = findViewById(R.id.button_fake)
        button_anketka = findViewById(R.id.button_anketka)

        button_l_t.setOnClickListener {
            if (ActivityCompat.checkSelfPermission(this,
                            android.Manifest.permission.ACCESS_COARSE_LOCATION) ==
                    PackageManager.PERMISSION_GRANTED &&
                    ActivityCompat.checkSelfPermission(this,
                            android.Manifest.permission.ACCESS_FINE_LOCATION)  ==
                    PackageManager.PERMISSION_GRANTED) {
                val wifi: WifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
                if (wifi.isWifiEnabled == true) {
                    val wifi_info: WifiInfo = wifi.connectionInfo
                    val bssid: String = wifi_info.bssid

                    //val database: FirebaseDatabase = FirebaseDatabase.getInstance()
                    //val myRef: DatabaseReference = database.getReference("BSSID")
                    //myRef1.setValue(bssid.toUpperCase())

                    showDialogWindow1()
                } else {
                    showDialogWindow2()
                }
            } else {
                showDialogWindow3()
                ActivityCompat.requestPermissions(this,
                        arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                        100)
            }
        }

        button_fake.setOnClickListener {
            showDialogWindow4()
        }

        button_anketka.setOnClickListener {
            val intent: Intent = Intent(this, Anketka1::class.java)
            startActivity(intent)
        }
    }

    private fun showDialogWindow1() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title)
        builder.setMessage(R.string.message1)
        builder.setNeutralButton(R.string.OK){dialogInterface, i ->}
        builder.show()
    }

    private fun showDialogWindow2() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title)
        builder.setMessage(R.string.message2)
        builder.setNeutralButton(R.string.OK){dialogInterface, i ->}
        builder.show()
    }

    private fun showDialogWindow3() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title)
        builder.setMessage(R.string.message3)
        builder.setNeutralButton(R.string.OK){dialogInterface, i ->}
        builder.show()
    }

    private fun showDialogWindow4() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.title)
        builder.setMessage(R.string.message4)
        builder.setNeutralButton(R.string.OK){dialogInterface, i ->}
        builder.show()
    }
}
