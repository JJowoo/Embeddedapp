package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_login=findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener{
            startActivity(Intent(this@MainActivity,login::class.java))

        }
    }



}