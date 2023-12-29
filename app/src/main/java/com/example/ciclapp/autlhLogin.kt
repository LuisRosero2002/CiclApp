package com.example.ciclapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ciclapp.databinding.ActivityAutlhLoginBinding
import com.example.ciclapp.databinding.ActivityMainBinding

class autlhLogin : AppCompatActivity() {
    private lateinit var binding: ActivityAutlhLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutlhLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLogin()
    }

    private fun initLogin() {
        //

    }

}