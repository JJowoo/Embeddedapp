package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText

class login : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        var button_login=findViewById<Button>(R.id.btn_login)
        var et_email= findViewById<EditText>(R.id.editText_email)
        var et_password =findViewById<EditText>(R.id.editText_Password)





        button_login.setOnClickListener{
            var intent=Intent(this,Mainpage::class.java)
            intent.putExtra("email",et_email.text.toString());
            intent.putExtra("password",et_password.text.toString())
            startActivity(intent)


        }

    }
}


