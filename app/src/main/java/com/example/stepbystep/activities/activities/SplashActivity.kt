package com.example.stepbystep.activities.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.stepbystep.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            startActivity( Intent(this@SplashActivity, InfoActivity::class.java))
            finish()

        }, 3000)

    }
}