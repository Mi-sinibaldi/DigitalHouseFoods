package com.example.digitalhousefoods.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.digitalhousefoods.R


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val handler = Handler()
        handler.postDelayed({ showLoginActivity() }, 2000)
    }

    private fun showLoginActivity() {
        val intent = Intent(
            this@SplashActivity, LoginActivity::class.java
        )
        startActivity(intent)
        finish()
    }
}