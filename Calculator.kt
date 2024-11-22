package com.example.empowering2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calculator : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val txtContact = findViewById<TextView>(R.id.txtContact)
        val txtHome = findViewById<TextView>(R.id.txtHome)
        val txtSixWeeks = findViewById<TextView>(R.id.txtSixWeeks)


        //Navigating to the next page

        txtContact.setOnClickListener {
            intent = Intent(this, ContactUs::class.java)
            startActivity(intent)
        }
        txtHome.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        txtSixWeeks.setOnClickListener {
            intent = Intent(this, SixWeeks::class.java)
            startActivity(intent)
        }
    }
}