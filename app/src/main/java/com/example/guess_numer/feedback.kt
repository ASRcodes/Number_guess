package com.example.guess_numer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText

class feedback : AppCompatActivity() {
    lateinit var button: Button
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        editText = findViewById(R.id.editTextText)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val feedback = editText.text.toString()
            sendEmailFeedback(feedback)
        }
    }
    private fun sendEmailFeedback(feedback: String) {
        val emailIntent = Intent(Intent.ACTION_SEND)
        emailIntent.type = "message/rfc822"
        emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("rajsinghrajput7002@gmail.com"))
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App")
        emailIntent.putExtra(Intent.EXTRA_TEXT, feedback)
        if (emailIntent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(emailIntent, "Send Email"))
        }
    }
}