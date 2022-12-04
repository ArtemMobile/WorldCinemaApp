package ru.avsematkin.srezapp2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}