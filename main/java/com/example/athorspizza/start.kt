package com.example.athorspizza

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class start : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_start)
        val btnNavigateLogin: Button = findViewById(R.id.button2)
        btnNavigateLogin.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
       val btnNavigateRegister: Button = findViewById(R.id.button3)
        btnNavigateRegister.setOnClickListener{
            val intent = Intent(this,reg ::class.java)
            startActivity(intent)
        }

    }
}