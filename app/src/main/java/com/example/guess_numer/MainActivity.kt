package com.example.guess_numer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var button2:Button
    lateinit var button3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val inta = Intent(this, Levels::class.java)
            startActivity(inta)
        }

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener{
            val Ins = Intent(this,Levels2::class.java)
            startActivity(Ins)
        }
        button3 = findViewById(R.id.button3)
        button3.setOnClickListener{
            val insta = Intent(this,Levels3::class.java)
            startActivity(insta)
        }


    }
}