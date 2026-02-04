package com.example.mytestapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mytestapplication.Cutomer.CustomerHomeScreen.ParlourHomeScreenActivity
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val goto = findViewById<TextView>(R.id.helooo)
        goto.setOnClickListener {
            val intent = Intent(this, ParlourHomeScreenActivity::class.java)
            startActivity(intent)
        }
    }
}