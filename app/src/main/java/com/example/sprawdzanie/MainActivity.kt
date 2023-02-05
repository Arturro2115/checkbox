package com.example.sprawdzanie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val guzior=findViewById<Button>(R.id.SubmitButton)
        val password=findViewById<EditText>(R.id.password)
        val passwords=findViewById<EditText>(R.id.passwords)


        guzior.setOnClickListener{
            val check=findViewById<CheckBox>(R.id.CheckZgodny)
            if(password.text.toString()!=passwords.text.toString()){
                check.isChecked=false
            }else{
                check.isChecked=true

            }
        }
    }
}