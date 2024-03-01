package com.example.guess_numer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class desing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desing)
        Handler(Looper.getMainLooper()).postDelayed({
            val intant = Intent(this,options::class.java)
            startActivity(intant)
            finish()
        },2000)
    }
}