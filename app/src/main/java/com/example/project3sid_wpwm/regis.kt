package com.example.project3sid_wpwm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class regis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_regis)
    }

    fun login(view: View?) {
        val i = Intent(applicationContext, Login::class.java)
        startActivity(i)

    }
}