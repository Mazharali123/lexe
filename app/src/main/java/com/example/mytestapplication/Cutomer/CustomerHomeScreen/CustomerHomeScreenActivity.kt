package com.example.mytestapplication.Cutomer.CustomerHomeScreen

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mytestapplication.R
import com.example.mytestapplication.UniqueServiceDetailsActivity

class CustomerHomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customer_home_screen)

        val getSbar = findViewById<EditText>(R.id.search_bar)
        getSbar.setOnClickListener {
            val intent = Intent(this, UniqueServiceDetailsActivity::class.java)
            startActivity(intent);
        }

    }
}