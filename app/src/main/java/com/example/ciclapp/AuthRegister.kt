package com.example.ciclapp

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import com.example.ciclapp.database.Auth
import com.example.ciclapp.databinding.ActivityAuthRegisterBinding
import com.example.ciclapp.databinding.ActivityAutlhLoginBinding
import com.google.firebase.auth.FirebaseAuth

class AuthRegister : AppCompatActivity() {
    private lateinit var binding: ActivityAuthRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRegister()
    }

    private fun initRegister() {

        val progressBar: ProgressBar = binding.progressBar

        binding.btnGuardar.setOnClickListener {

            progressBar.visibility = View.VISIBLE

            val txtCorreo = findViewById<EditText>(R.id.etCorreo)
            val Correo = txtCorreo.text.toString().trim()

            val txtPassword1 = findViewById<EditText>(R.id.etPassword1)
            val Password1 = txtPassword1.text.toString().trim()

            val txtPassword2 = findViewById<EditText>(R.id.etPassword2)
            val Password2 = txtPassword2.text.toString().trim()

            if ( Correo.isNotEmpty() && Password1.isNotEmpty() && Password2.isNotEmpty()) {

                if (Password1 != Password2){

                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Las Contraseñas No Coinciden")
                    builder.setMessage("Por favor, Verifica de nuevo")
                    builder.setIcon(R.drawable.baseline_cancel_24)
                    builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                        dialog.dismiss()
                    }

                    val dialog = builder.create()
                    dialog.show()

                }
                else{
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(Correo, Password1).addOnCompleteListener() {
                        if (it.isSuccessful) {
                            // Mostrar un AlertDialog si todo esta bien
                            val builder = AlertDialog.Builder(this)
                            builder.setTitle("Datos Registrados")
                            builder.setMessage("Bienvenido")
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
                                verificarInfoUsuario(Correo) { existeUsuario ->
                                    if (existeUsuario) {
                                        val intent = Intent(this, HomeActivity::class.java)
                                        intent.putExtra("correo", Correo)
                                        progressBar.visibility = View.GONE
                                        startActivity(intent)
                                        finishAffinity()
                                    } else {
                                        progressBar.visibility = View.GONE
                                        val intent = Intent(this, InfoDataUserActivity::class.java)
                                        intent.putExtra("correo", Correo)
                                        progressBar.visibility = View.GONE
                                        startActivity(intent)
                                        finishAffinity()
                                    }
                                }

                            }

                            val dialog = builder.create()
                            dialog.show()
                        }
                    }



                }
            }else{

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Campos vacíos")
                builder.setMessage("Por favor, completa todos los campos.")
                builder.setIcon(R.drawable.baseline_cancel_24)
                builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                    dialog.dismiss()
                }

                val dialog = builder.create()
                dialog.show()
            }

        }

        binding.btnAtras.setOnClickListener {
           onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Llama a finish() para cerrar la Activity actual y retroceder a la anterior en la pila
        finish()
    }

    private fun verificarInfoUsuario(correo: String, callback: (Boolean) -> Unit) {
        val controlerDatabase = Auth()

        controlerDatabase.getUser(correo) { usuarioEncontrado ->
            callback(usuarioEncontrado != null)
        }
    }
}