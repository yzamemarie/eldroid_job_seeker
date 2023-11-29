package com.example.job_seeker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.job_seeker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val SPLASH_SCREEN = 2500

    private lateinit var binding: ActivityMainBinding
    private lateinit var anim: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) // removes status bar
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        anim = AnimationUtils.loadAnimation(this, R.anim.slide_top)
        binding.logoImage.startAnimation(anim)

        val handler = Handler()

        handler.post {
            val intent = Intent(this@MainActivity, Login::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
            finish()
        }

        //idk wha happened pero kadiyot ra kaayo ang splash logo ikaw na bahala fix ana boss amo kotlin god uwu

    }
}