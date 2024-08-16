package com.example.athorspizza

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reg)

        val btnNavigateRegisterNow:Button = findViewById(R.id.button4)
        btnNavigateRegisterNow.setOnClickListener{
            val intent = Intent(this,Welcom::class.java)
            startActivity(intent)
        }


    }
}