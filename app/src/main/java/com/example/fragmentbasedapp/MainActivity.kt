package com.example.fragmentbasedapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_button.setOnClickListener {
            Toast.makeText(this, "Activity's Button", Toast.LENGTH_LONG).show()
        }
    }
}