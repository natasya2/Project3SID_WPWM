package com.example.project3sid_wpwm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_pay)
    }
    fun home(view: View?) {
        val i = Intent(applicationContext, home::class.java)
        startActivity(i)

    }
    fun glamping(view: View?) {
        val i = Intent(applicationContext, glamping::class.java)
        startActivity(i)

    }
    fun pay(view: View?) {
        val i = Intent(applicationContext, pay::class.java)
        startActivity(i)

    }
    fun user(view: View?) {
        val i = Intent(applicationContext, user::class.java)
        startActivity(i)

    }
}