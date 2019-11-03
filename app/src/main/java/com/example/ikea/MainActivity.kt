package com.example.ikea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idButtonDresser.setOnClickListener {
            val intent = Intent(this,Dresser::class.java)
            startActivity(intent)
        }
        idButtonBicycle.setOnClickListener {
            val intent = Intent(this,Bicycle::class.java)
            startActivity(intent)
        }
        idButtonPatio.setOnClickListener {
            val intent = Intent(this,Patio::class.java)
            startActivity(intent)
        }
    }
}
