package com.example.guess_numer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.Random

class Levels3 : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var editText: EditText
    private lateinit var yo: String
    private var a: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levels3)
        editText = findViewById(R.id.edit)
        button = findViewById(R.id.guess)

        val random = Random()
        a = random.nextInt(80) + 1

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                check()
            }
        })
    }

    private fun check() {
        val text = editText.text.toString().trim()

        val userGuess = text.toIntOrNull()

        if (userGuess != null) {
            if (a < userGuess) {
                yo = "!!Try Lower!!"
            } else if (a > userGuess) {
                yo = "!!Try Higher!!"
            } else {
                yo = "Congrats! you got it"
            }
            Toast.makeText(this, yo, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
        }
    }
}
