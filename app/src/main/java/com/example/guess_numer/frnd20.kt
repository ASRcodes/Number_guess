package com.example.guess_numer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.guess_numer.databinding.ActivityFrnd20Binding

class frnd20 : AppCompatActivity() {
    val binding by lazy {
        ActivityFrnd20Binding.inflate(layoutInflater)
    }
    private lateinit var yo: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val recievedGuess = intent.getStringExtra("guess_value20")
        binding.guess.setOnClickListener {
            val user20 = binding.editAns20.text.toString()
            check(recievedGuess,user20)
        }
    }
    fun check(recievedGuess:String?, user20:String){
        val guessInt = recievedGuess?.toIntOrNull()
        val userInt = user20.toIntOrNull()
        if ( guessInt != null) {
            if (userInt != null) {
                if ( guessInt < userInt) {
                    yo = "!!Try Lower!!"
                } else if (guessInt > userInt) {
                    yo = "!!Try Higher!!"
                } else {
                    yo = "Congrats! you got it"
                }
                Toast.makeText(this, yo, Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}