package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText: TextView = findViewById(R.id.title_text)
        val counterText: TextView = findViewById(R.id.counter_text)
        val actionButton: Button = findViewById(R.id.btn_click)

        titleText.text = "Hello from My Application!"

        actionButton.setOnClickListener {
            counter++
            counterText.text = "Button Clicked: $counter times"
            Toast.makeText(this, "Count incremented to $counter", Toast.LENGTH_SHORT).show()
        }
    }
}