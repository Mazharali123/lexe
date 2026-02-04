package com.example.mytestapplication.CustomerBeatisian

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mytestapplication.Cutomer.CustomerHomeScreen.CustomerHomeScreenActivity
import com.example.mytestapplication.R

class CustomterOrBeatisean : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customter_or_beatisean)

        val getSearchBar = findViewById<CheckBox>(R.id.checkBoxBeatisean)
        getSearchBar.setOnClickListener {
            val intent = Intent(this, CustomerHomeScreenActivity::class.java)
            startActivity(intent)
        }

    }
}