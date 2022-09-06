package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)
        /*

        val tv_login=findViewById<TextView>(R.id.textView1)

        if(intent.hasExtra("email")){
            tv_login.text=intent.getStringExtra("email")
        }
        if(intent.hasExtra("password")){
            tv_login.text=intent.getStringExtra("password")
        }

         */
    }
}