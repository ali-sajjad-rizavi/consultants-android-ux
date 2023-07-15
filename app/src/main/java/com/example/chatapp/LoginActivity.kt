package com.example.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Toast
import com.example.chatapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityLoginBackButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.attemptLoginButton.setOnClickListener {
            showLoadingIndicator(true)

            val email = binding.emailEdittext.text.toString()
            val password = binding.passwordEdittext.text.toString()

            // Adding fake delay for simulation of login process
            Handler(Looper.getMainLooper()).postDelayed({
                if (email == "example@mail.com" && password == "abc123") {
                    showLoadingIndicator(false)

                    // Go to logged in user homepage
                    val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                    startActivity(intent)
                }
                else {
                    // Show incorrect credentials
                    showLoadingIndicator(false)
                    showError()
                }
            }, 2000)
        }
    }

    private fun showLoadingIndicator(show: Boolean) {
        binding.attemptLoginButton.isEnabled = !show
        binding.loginProgressBar.visibility = if (show) View.VISIBLE else View.GONE
    }

    private fun showError() {
        Toast.makeText(this, "Invalid username or password!", Toast.LENGTH_SHORT).show()
    }
}