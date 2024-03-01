package com.example.guess_numer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.guess_numer.databinding.ActivityOptionsBinding

class options : AppCompatActivity() {
val binding by lazy {
    ActivityOptionsBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.frnd.setOnClickListener {
            startActivity(Intent(this@options,Frnd::class.java))
        }
        binding.system.setOnClickListener {
            startActivity(Intent(this@options,MainActivity::class.java))
        }

        binding.button4.setOnClickListener{
            val inst = Intent(this,feedback::class.java)
            startActivity(inst)
        }
    }
}