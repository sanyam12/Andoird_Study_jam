package com.example.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.widget.VideoView

class SplashActivity : AppCompatActivity() {

    val t:Long = 3500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@SplashActivity, PostActivity::class.java)
            startActivity(intent)
            finish()
        }, t)


    }
}
