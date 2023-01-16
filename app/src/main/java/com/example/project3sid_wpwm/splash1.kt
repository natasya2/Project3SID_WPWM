package com.example.project3sid_wpwm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash1)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this@splash1, splash2::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}