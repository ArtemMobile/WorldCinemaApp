package ru.avsematkin.srezapp2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.ActivityFilmBinding

class FilmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilmBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            tvDescription.text = intent.getStringExtra("description")
            Glide.with(this@FilmActivity)
                .load(intent.getStringExtra("image"))
                .into(ivFilmCover)
        }
    }
}