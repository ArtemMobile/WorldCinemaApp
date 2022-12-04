package ru.avsematkin.srezapp2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivLogo.alpha = 0F
        binding.ivLogo.animate().setDuration(2000).alpha(1F).withEndAction{
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}