package com.example.splashscreen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.os.Looper
import android.content.Intent
import android.os.Handler
import android.view.LayoutInflater
import com.example.splashscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this, splash::class.java))
                finish()
            },1000)
        }
    }
}