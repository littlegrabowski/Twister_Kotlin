package com.example.twister_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var btn_start = findViewById(R.id.start_button) as Button

        val button_start = findViewById<Button>(R.id.start_button)
        button_start.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)

        }
    }
//comment :P
}
