package com.example.ciclapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ciclapp.database.Auth
import com.example.ciclapp.databinding.ActivityAutlhLoginBinding
import com.example.ciclapp.databinding.ActivityTrainingBinding
import com.example.ciclapp.models.Users
import com.example.ciclapp.recyclerview.CustomAdapter

class TrainingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTrainingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrainingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initTraining()

        val btnBack : Button = findViewById(R.id.btnBack)

        btnBack.setOnClickListener{
            finish()
        }
    }

    private fun initTraining() {
        val recyclerView = binding.idRecycler
        val correo = intent?.getStringExtra("correo")
        Log.d("JESUS", "Correo antes de iniciar Training: $correo")



        verificarInfoUsuario(correo.toString()) { existeUsuario ->
            if (existeUsuario !== null)  {
                val adapter = CustomAdapter(existeUsuario.nivelEntreno)
                recyclerView.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = adapter
            }
        }


    }


    private fun verificarInfoUsuario(correo: String, callback: (Users?) -> Unit) {
        val controlerDatabase = Auth()

        controlerDatabase.getUser(correo) { usuarioEncontrado ->
            callback(usuarioEncontrado)
        }
    }
}