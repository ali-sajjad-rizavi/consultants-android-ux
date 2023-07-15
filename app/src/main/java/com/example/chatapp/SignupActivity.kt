package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapp.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userButton.setOnClickListener {
            // TODO: Send some data to tell it's user
            val intent = Intent(
                this@SignupActivity, SignupUserdetailActivity::class.java
            )
            startActivity(intent)
        }

        binding.advisorButton.setOnClickListener {
            // TODO: Send some data to tell it's an advisor
            val intent = Intent(
                this@SignupActivity, SignupUserdetailActivity::class.java
            )
            startActivity(intent)
        }
    }
}