package com.example.guess_numer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.guess_numer.databinding.ActivityFrnd50Binding

class frnd50 : AppCompatActivity() {
    val binding by lazy {
        ActivityFrnd50Binding.inflate(layoutInflater)
    }
    private lateinit var yep:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val recieveGuess50 = intent.getStringExtra("guess_value50")
        binding.guess.setOnClickListener {
            val user50 = binding.editAns50.text.toString()
            check(recieveGuess50,user50)
        }
    }
    fun check(recieveGuess50:String?,user50:String){
        val frndInt = recieveGuess50?.toIntOrNull()
        val userInt = user50.toIntOrNull()
        if (frndInt!= null){
            if (userInt != null){
                if (frndInt>userInt){
                    yep = "Try higher"
                }
                else if (userInt>frndInt){
                    yep = "Try lower"
                }
                else{
                    yep = "Congrats you Guessed that!!!"
                }
                Toast.makeText(this@frnd50, yep, Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Enter the number first!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}