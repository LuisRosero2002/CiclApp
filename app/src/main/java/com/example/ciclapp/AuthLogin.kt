package com.example.ciclapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import com.example.ciclapp.database.Auth
import com.example.ciclapp.databinding.ActivityAutlhLoginBinding
import com.example.ciclapp.fragments.ProfileFragment
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

        val progressBar: ProgressBar = binding.progressBar

        binding.btnRegistrarse.setOnClickListener{
            val intent = Intent(this, AuthRegister::class.java)
            startActivity(intent)
        }

        binding.btnIngresar.setOnClickListener {
            val txtUser:EditText = binding.etUser
            val user: String = txtUser.text.toString().trim()

            val txtPassword:EditText = binding.etPassword
            val password: String = txtPassword.text.toString().trim()

            progressBar.visibility = View.VISIBLE


            if (user.isNotEmpty() && password.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(user, password).addOnCompleteListener() {
                    if (it.isSuccessful) {
                        // Mostrar un AlertDialog si todo esta bien
                        val builder = AlertDialog.Builder(this)
                        builder.setTitle("Bienvenido")
                        builder.setMessage("Gracias por utilizar nuestra app")
                        builder.setIcon(R.drawable.baseline_verified_24)
                        builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                            dialog.dismiss()
                            verificarInfoUsuario(user) { existeUsuario ->
                                if (existeUsuario) {
                                    val intent = Intent(this, HomeActivity::class.java)
                                    intent.putExtra("correo", user)
                                    progressBar.visibility = View.GONE
                                    startActivity(intent)
                                    finishAffinity()
                                } else {
                                    progressBar.visibility = View.GONE
                                    val intent = Intent(this, InfoDataUserActivity::class.java)
                                    intent.putExtra("correo", user)
                                    progressBar.visibility = View.GONE
                                    startActivity(intent)
                                    finishAffinity()
                                }
                            }

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

    private fun verificarInfoUsuario(correo: String, callback: (Boolean) -> Unit) {
        val controlerDatabase = Auth()

        controlerDatabase.getUser(correo) { usuarioEncontrado ->
            callback(usuarioEncontrado != null)
        }
    }


}