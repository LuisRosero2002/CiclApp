package com.example.ciclapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isNotEmpty
import com.example.ciclapp.database.Auth
import com.example.ciclapp.databinding.ActivityInfoDataUserBinding
import com.example.ciclapp.models.Users
import java.util.UUID


class InfoDataUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoDataUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoDataUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initInfo()
    }

    private fun initInfo() {


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Necesitamos completar tu perfil")
        builder.setMessage("Complete los campos faltantes")
        builder.setIcon(R.drawable.baseline_info_24)
        builder.setPositiveButton("Continuar") { dialog: DialogInterface, _ ->
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()


        var experiencia: String? = null
        var entreno: String? = null
        var sexo: String? = null

        val spinnerEntreno = binding.etEntreno

        val opcionesEntreno = arrayOf("Basico", "Medio", "Alto")
        val adaptadorEntreno = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, opcionesEntreno)
        adaptadorEntreno.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerEntreno.adapter = adaptadorEntreno

        val spinnerExperiencia = binding.etExperiencia

        val opcionesExperiencia = arrayOf("Principiante", "Intermedio", "Experto")
        val adaptadorExperiencia = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, opcionesExperiencia)
        adaptadorExperiencia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerExperiencia.adapter = adaptadorExperiencia

        spinnerExperiencia.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: android.view.View?,
                    position: Int,
                    id: Long
                ) {
                    experiencia = opcionesExperiencia[position]
                }

                override fun onNothingSelected(parent: AdapterView<*>) {}
            }
        spinnerEntreno.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: android.view.View?,
                    position: Int,
                    id: Long
                ) {
                    entreno = opcionesEntreno[position]
                }

                override fun onNothingSelected(parent: AdapterView<*>) {}
            }

        binding.btnGuardar.setOnClickListener {

            val id = UUID.randomUUID().toString()

            val nombre = (binding.etNombre).text.toString()
            val apellido = (binding.etApellido).text.toString()
            val edad = (binding.etEdad).text
            val radioSexo = binding.radioGroupInfo
            val correo = intent.getSerializableExtra("correo")
            val selectedRadioBtnSexo = radioSexo.checkedRadioButtonId

            if (!(apellido.isNotEmpty() && edad.isNotEmpty() && spinnerExperiencia.isNotEmpty() && spinnerEntreno.isNotEmpty())) {

                val builder = AlertDialog.Builder(this)
                builder.setTitle("Campos faltantes")
                builder.setMessage("Complete los campos faltantes")
                builder.setIcon(R.drawable.baseline_cancel_24)
                builder.setPositiveButton("Aceptar") { dialog: DialogInterface, _ ->
                    dialog.dismiss()
                }
                val dialog = builder.create()
                dialog.show()
            } else {
                try {


                    if (selectedRadioBtnSexo != -1) {
                        val selectedRadioButton: RadioButton = findViewById(selectedRadioBtnSexo)
                        sexo = selectedRadioButton.text.toString()
                    }

                    val inputData = Users(
                        nombre = nombre,
                        apellido = apellido,
                        correo = correo.toString(),
                        nivelEntreno = entreno.toString(),
                        experiencia = experiencia.toString(),
                        edad = edad.toString(),
                        sexo = sexo.toString(),
                        id = id
                    )
                    ingresarUsuario(inputData)

                } catch (e: Exception) {
                    Log.e("Error",e.toString())
                }


            }


        }

    }

    private fun ingresarUsuario(inputData:Users) {

        val controlerDatabase = Auth()

        controlerDatabase.insertUser(inputData) { isSuccess ->
            if (isSuccess) {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Perfil Completado")
                builder.setMessage("Felicitaciones tu perfil ha sido completado")
                builder.setIcon(R.drawable.baseline_verified_24)
                builder.setPositiveButton("Continuar") { dialog: DialogInterface, _ ->
                    dialog.dismiss()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finishAffinity()
                }
                val dialog = builder.create()
                dialog.show()

            } else {
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Error de auntentucacion")
                builder.setMessage("Ocurrrio un error vuelve a intentarlo")
                builder.setIcon(R.drawable.baseline_cancel_24)
                builder.setPositiveButton("ok") { dialog: DialogInterface, _ ->
                    dialog.dismiss()
                }
                val dialog = builder.create()
                dialog.show()
            }
        }
    }

}