package ru.avsematkin.srezapp2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.ActivityMainBinding
import ru.avsematkin.srezapp2.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().replace(R.id.fragment, MainFragment()).commit()

        binding.navView.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.Main-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, MainFragment()).commit()
                    true
                }

                else -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, MainFragment()).commit()
                    true
                }
            }
        }
    }
}