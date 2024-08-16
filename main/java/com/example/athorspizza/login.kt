package com.example.athorspizza

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btnNavigatelogin: Button = findViewById(R.id.button5)
        btnNavigatelogin.setOnClickListener {
            val intent = Intent(this,Welcom::class.java)
            startActivity(intent)
        }

    }
}