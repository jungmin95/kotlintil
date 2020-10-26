package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("AndroidStudy", "onCreate")

        //선언부분
        val textButton = findViewById<Button>(R.id.TextButton)
        val helloWorldString = findViewById<TextView>(R.id.helloWorldString)

        textButton.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            //intent 안에 putextra를 사용하면 간단한 data 넘기기 가능
            intent.putExtra("Value", "TTTT")

            startActivity(intent)
        }

        val tableButton = findViewById<Button>(R.id.TableButton)
        tableButton.setOnClickListener {
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        println("onStart")
        Log.e("AndroidStudy", "onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
        Log.e("AndroidStudy", "onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
        Log.e("AndroidStudy", "onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
        Log.e("AndroidStudy", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart")
        Log.e("AndroidStudy", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
        Log.e("AndroidStudy", "onDestroy")
    }

}