package ru.avsematkin.srezapp2.activity

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.ActivityLoginBinding
import ru.avsematkin.srezapp2.preferences.PrefsManager

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogIn.setOnClickListener{
            if(dataIsValid()){
                startActivity(Intent(this, MainActivity::class.java))
                PrefsManager(this).logIn()
                finish()
            }
            else{
                Toast.makeText(this,
                    "Поля не должны быть пустыми, электронная почта должна быть правильной",
                    Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSignUp.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

    }

    private fun dataIsValid(): Boolean{
        return binding.etPassword.text.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(binding.etEmail.text).matches()
    }
}