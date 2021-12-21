package com.example.prototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    val t:Long = 3500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tlAnim: Animation = AnimationUtils.loadAnimation(this,R.anim.tl_anim)
        val trAnim: Animation = AnimationUtils.loadAnimation(this,R.anim.tr_anim)
        val blAnim: Animation = AnimationUtils.loadAnimation(this,R.anim.bl_anim)
        val brAnim: Animation = AnimationUtils.loadAnimation(this,R.anim.br_anim)
        val tl:ImageView = findViewById(R.id.imageView)
        val tr:ImageView = findViewById(R.id.imageView3)
        val bl:ImageView = findViewById(R.id.imageView4)
        val br:ImageView = findViewById(R.id.imageView5)


        tl.animation = tlAnim
        tr.animation = trAnim
        bl.animation = blAnim
        br.animation = brAnim


        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(this@SplashActivity, LogIn::class.java)
            startActivity(intent)
            finish()
        }, t)
    }
}