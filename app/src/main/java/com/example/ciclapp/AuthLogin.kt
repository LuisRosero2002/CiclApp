package com.example.ciclapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.ciclapp.databinding.ActivityAutlhLoginBinding

class AuthLogin : AppCompatActivity() {
    private lateinit var binding: ActivityAutlhLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutlhLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLogin()
    }

    private fun initLogin() {

        binding.btnRegistrarse.setOnClickListener{
            val intent = Intent(this, AuthRegister::class.java)
            startActivity(intent)
        }

        binding.btnIngresar.setOnClickListener {
            val txtUser:EditText = binding.etUser
            val user: String = txtUser.toString().trim()

            val txtPassword:EditText = binding.etPassword
            val password: String = txtPassword.toString().trim()

            /// Conexion al login firebase o API


            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finishAffinity()

        }

    }

}