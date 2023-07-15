package com.example.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chatapp.databinding.ActivityProviderProfileBinding

class ProviderProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProviderProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProviderProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.providerProfileBackButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}