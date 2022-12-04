package ru.avsematkin.srezapp2.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import ru.avsematkin.srezapp2.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSingUp.setOnClickListener{
            if(dataIsValid()){
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            else{
                Toast.makeText(this,
                    "Поля не должны быть пустыми, электронная почта должна быть правильной, пароли должны совпадать",
                    Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnSignIn.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    private fun dataIsValid(): Boolean{
        return binding.etPassword.text.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(binding.etEmail.text).matches()
                && binding.etName.text.isNotEmpty() && binding.etSurname.text.isNotEmpty()
                && binding.etPassword.text == binding.etConfirmPassword.text

    }
}