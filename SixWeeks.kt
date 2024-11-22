package com.example.empowering2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class SixWeeks : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_weeks)

        val txtContact = findViewById<TextView>(R.id.txtContact)
        val txtHome = findViewById<TextView>(R.id.txtHome)
        val txtSixWeeks = findViewById<TextView>(R.id.txtSixWeeks)

        val txtName = findViewById<TextView>(R.id.txtName)
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val txtPhone = findViewById<TextView>(R.id.txtPhone)
        val txtCalculate = findViewById<TextView>(R.id.txtCalculate)

        val chkFirst = findViewById<CheckBox>(R.id.chkFirst)
        val chkLand = findViewById<CheckBox>(R.id.chkLand)
        val chkSewing = findViewById<CheckBox>(R.id.chkSewing)
        val chkLife = findViewById<CheckBox>(R.id.chkLife)


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
        chkFirst.setOnClickListener {
            if (chkFirst.isChecked) {
                val baseAmount = 1500
                val total = baseAmount + (baseAmount * 0.15)
                txtCalculate.text =total.toString()
            }
        }
        chkLand.setOnClickListener {
            if (chkLand.isChecked) {
                val baseAmount = 2200
                val total = baseAmount + (baseAmount * 0.15)
                txtCalculate.text =total.toString()
            }
        }


        chkSewing.setOnClickListener {
            if (chkSewing.isChecked) {
                val baseAmount = 1800
                val total = baseAmount + (baseAmount * 0.15)
                txtCalculate.text =total.toString()
            }
        }

        chkLife.setOnClickListener {
            if (chkLife.isChecked) {
                val baseAmount = 1600
                val total = baseAmount + (baseAmount * 0.15)
                txtCalculate.text =total.toString()

            }

        }


    }
}