package ru.avsematkin.srezapp2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.avsematkin.srezapp2.R
import ru.avsematkin.srezapp2.databinding.ActivityMainBinding
import ru.avsematkin.srezapp2.fragment.CollectionsFragment
import ru.avsematkin.srezapp2.fragment.MainFragment
import ru.avsematkin.srezapp2.fragment.ProfileFragment
import ru.avsematkin.srezapp2.fragment.RangeFragment

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

                R.id.Range-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, RangeFragment()).commit()
                    true
                }
                R.id.Collections-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, CollectionsFragment()).commit()
                    true
                }
                R.id.Profile-> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, ProfileFragment()).commit()
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