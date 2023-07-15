package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapp.databinding.ActivitySignupUserdetailBinding

class SignupUserdetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupUserdetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupUserdetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userDetailBackButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}