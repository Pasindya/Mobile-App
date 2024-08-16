package com.example.athorspizza

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcom : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcom)

        val btnNavigatecheesepizza: TextView = findViewById(R.id.textView15)
        btnNavigatecheesepizza.setOnClickListener {
            val intent = Intent(this, cheesepizza::class.java)
            startActivity(intent)
        }
        val btnNavigateprofile: TextView = findViewById(R.id.textView7)
        btnNavigateprofile.setOnClickListener{
            val intent = Intent(this,profile::class.java)
            startActivity(intent)
        }




    }
    }
