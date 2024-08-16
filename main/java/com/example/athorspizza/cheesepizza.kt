package com.example.athorspizza

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cheesepizza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cheesepizza)

        val btnNavigateBuyNow: Button = findViewById(R.id.addToCartButton)
        btnNavigateBuyNow.setOnClickListener{
            val intent = Intent(this,payment::class.java)
            startActivity(intent)
        }

    }
}