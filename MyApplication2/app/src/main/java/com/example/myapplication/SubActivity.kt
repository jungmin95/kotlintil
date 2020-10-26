package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val value = intent.getStringExtra("Value")
        val values = intent.extras?.get("Value")
        if (value != null) {
            Log.e("AndroidStudy", value)
        }
        Log.e("AndroidStudy", values as String)

        val subActivityButton = findViewById<Button>(R.id.SubActivityButton)
        subActivityButton.setOnClickListener {

        }
    }
}