package com.example.sprawdzanie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.CheckBox
import java.util.regex.Pattern

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

                val check1=findViewById<CheckBox>(R.id.CheckDuzaLitera)
                val duzalitera = Pattern.compile(".*[A-Z].*").matcher(password.text.toString()).matches() ||
                        Pattern.compile(".*[A-Z].*").matcher(passwords.text.toString()).matches()
                check1.isChecked = duzalitera

                val check2=findViewById<CheckBox>(R.id.CheckMalaLitera)
                val malalitera = Pattern.compile(".*[a-z].*").matcher(password.text.toString()).matches() ||
                        Pattern.compile(".*[a-z].*").matcher(passwords.text.toString()).matches()
                check2.isChecked = malalitera
            }
        }
    }
}