package com.example.tourism
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val placesButton = findViewById<Button>(R.id.placesButton)
        val restaurantsButton = findViewById<Button>(R.id.restaurantsButton)
        val foodsButton = findViewById<Button>(R.id.foodsButton)

        placesButton.setOnClickListener {
            try {
                val i = Intent(this, famousplace::class.java)
                startActivity(i)
            } catch (e: Exception) {
                // Handle the exception or log the error
                e.printStackTrace() // Log the exception stack trace
            }
        }

        restaurantsButton.setOnClickListener {
            try {
                val i = Intent(this, famousresta::class.java)
                startActivity(i)
            } catch (e: Exception) {
                // Handle the exception or log the error
                e.printStackTrace() // Log the exception stack trace
            }
        }

        foodsButton.setOnClickListener {
            try {
                val i = Intent(this, famousfood::class.java)
                startActivity(i)
            } catch (e: Exception) {
                // Handle the exception or log the error
                e.printStackTrace() // Log the exception stack trace
            }
        }
    }
    override fun onDestroy() {
        // Release resources, close connections, or perform cleanup here
        super.onDestroy()
    }
}