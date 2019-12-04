package com.example.ojolali101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SystemClock.sleep(1000)
        val intent=Intent(this, Dashboard::class.java)
        startActivity(intent)
        finish()

    }
}
