package com.example.ciclapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.example.ciclapp.databinding.ActivityAutlhLoginBinding
import com.google.firebase.auth.FirebaseAuth

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
            val user: String = txtUser.text.toString().trim()

            val txtPassword:EditText = binding.etPassword
            val password: String = txtPassword.text.toString().trim()

            if (user.isNotEmpty() && password.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(user, password).addOnCompleteListener() {
                    if (it.isSuccessful) {
                        // Mostrar un AlertDialog si todo esta bien
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("Bienvenido")
                        builder.setMessage("Gracias por utilizar nuestra app")
                        builder.setIcon(R.drawable.baseline_verified_24)
                        builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                            dialog.dismiss() // Cierra el diálogo cuando se hace clic en el botón "Aceptar"
                            val intent = Intent(this, HomeActivity::class.java)
                            startActivity(intent)
                            finishAffinity()
                        }

                        val dialog = builder.create()
                        dialog.show()

                    } else {
                        // Mostrar un AlertDialog si algún error ocurrio
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("Error de Autenticacion")
                        builder.setMessage("Por favor, Verifica de nuevo")
                        builder.setIcon(R.drawable.baseline_cancel_24)
                        builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                            dialog.dismiss() // Cierra el diálogo cuando se hace clic en el botón "Aceptar"
                        }

                        val dialog = builder.create()
                        dialog.show()
                    }
                }
            }else{
                // Mostrar un AlertDialog si algún campo está vacío
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Campos vacíos")
                builder.setMessage("Por favor, completa todos los campos.")
                builder.setIcon(R.drawable.baseline_cancel_24)
                builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                    dialog.dismiss() // Cierra el diálogo cuando se hace clic en el botón "Aceptar"
                }

                val dialog = builder.create()
                dialog.show()
            }


        }

    }

}