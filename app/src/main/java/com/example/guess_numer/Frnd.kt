package com.example.guess_numer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.guess_numer.databinding.ActivityFrndBinding

class Frnd : AppCompatActivity() {
val binding by lazy {
    ActivityFrndBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.go20.setOnClickListener {
            if (binding.edit20.text.isNotEmpty() || binding.edit50.text.isNotEmpty()){
                var guess20 = binding.edit20.text.toString()
                var guessInt = guess20.toIntOrNull()
                if (guessInt != null) {
                    if (guessInt>20){
                        Toast.makeText(this, "you can't take number larger then 20", Toast.LENGTH_SHORT).show()
                    } else {
                        val ints = Intent(this@Frnd, frnd20::class.java)
                        ints.putExtra("guess_value20", guess20)
                        startActivity(ints)
                        finish()
                    }
                }
            }
            else{
                Toast.makeText(this, "Give a number first", Toast.LENGTH_SHORT).show()
            }
        }
        binding.go50.setOnClickListener {
            if (binding.edit20.text.isNotEmpty() || binding.edit50.text.isNotEmpty()){
                var guess50 = binding.edit50.text.toString()
                if (guess50> 50.toString()){
                    Toast.makeText(this, "you can't take number larger then 50", Toast.LENGTH_SHORT).show()
                }
                else {
                    val ints2 = Intent(this@Frnd, frnd50::class.java)
                    ints2.putExtra("guess_value50", guess50)
                    startActivity(ints2)
                    finish()
                }
            }
            else{
                Toast.makeText(this, "Give a number first", Toast.LENGTH_SHORT).show()
            }
        }
    }
}