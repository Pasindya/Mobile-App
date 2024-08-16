package com.example.athorspizza

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)

        val btnNavigatePaynow:Button = findViewById(R.id.payButton)
        btnNavigatePaynow.setOnClickListener{
            val intent = Intent(this,progress::class.java)
            startActivity(intent)
        }
    }
}