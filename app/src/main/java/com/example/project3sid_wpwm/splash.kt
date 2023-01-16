package com.example.project3sid_wpwm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@splash, splash1::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}