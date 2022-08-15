package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Putting buttons into variables
        val helloButton = findViewById<Button>(R.id.helloButton)
        val goodbyeButton = findViewById<Button>(R.id.goodbyeButton)

        // Adding click listeners/handlers to both buttons
        helloButton.setOnClickListener {
            Toast.makeText(this, R.string.toast_greeting, Toast.LENGTH_SHORT).show()
        }

        goodbyeButton.setOnClickListener {
            Toast.makeText(this, R.string.toast_farewell, Toast.LENGTH_SHORT).show()
        }
    }
}