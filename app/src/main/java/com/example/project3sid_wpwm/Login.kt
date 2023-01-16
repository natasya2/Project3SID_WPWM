package com.example.project3sid_wpwm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)
    }
    fun login(view: View?) {
        val i = Intent(applicationContext, home::class.java)
        startActivity(i)

    }
    fun regis(view: View?) {
        val i = Intent(applicationContext, regis::class.java)
        startActivity(i)
    }
}