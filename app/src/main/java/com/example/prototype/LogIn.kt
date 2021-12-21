package com.example.prototype

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LogIn: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bt: Button = findViewById(R.id.button)
        bt.setOnClickListener{
            val intent:Intent = Intent (this@LogIn, postAct::class.java)
            startActivity(intent)
            finish()
        }

        val bts: ImageButton = findViewById(R.id.button2)
        bts.setOnClickListener{
            val intent:Intent = Intent (this@LogIn, postAct::class.java)
            startActivity(intent)
            finish()
        }

        val btt: ImageButton = findViewById(R.id.button3)
        btt.setOnClickListener{
            val intent:Intent = Intent (this@LogIn, postAct::class.java)
            startActivity(intent)
            finish()
        }

        val btf: ImageButton = findViewById(R.id.button4)
        btf.setOnClickListener{
            val intent:Intent = Intent (this@LogIn, postAct::class.java)
            startActivity(intent)
            finish()
        }
    }
}