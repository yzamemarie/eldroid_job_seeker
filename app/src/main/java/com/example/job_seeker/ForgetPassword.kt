package com.example.job_seeker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.example.job_seeker.databinding.ActivityForgetPasswordBinding
import com.example.job_seeker.databinding.ActivityLoginBinding

class ForgetPassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) // removes status bar
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.resetButton.setOnClickListener() {
            Toast.makeText(this@ForgetPassword,"Password reset link has been sent to your email.", Toast.LENGTH_SHORT).show()
        }

        binding.backButton.setOnClickListener() {
            val intent = Intent(this@ForgetPassword, Login::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
            finish()
        }
    }
}