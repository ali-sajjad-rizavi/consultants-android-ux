package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapp.databinding.ActivityAskForAdvisorBinding

class AskForAdvisorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAskForAdvisorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAskForAdvisorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.askForAdvisorBackButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}