package com.example.forground_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var bStart:Button
    lateinit var bStop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bStart=findViewById(R.id.btnstart)
        bStop=findViewById(R.id.btnstop)

        bStart.setOnClickListener {
            MyService.startService(this, "Foreground Service is running...")
        }
        bStop.setOnClickListener {
            MyService.stopService(this)
        }

    }
}