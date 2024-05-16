package com.example.cataloguegan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.StartButton) // Find the button by its ID

        startButton.setOnClickListener {
            val intent = Intent(this, CategoryPage::class.java) // Use CategoryPage class
            startActivity(intent)
        }
    }
}