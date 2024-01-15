package com.example.ciclapp.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.ciclapp.HomeActivity
import com.example.ciclapp.InfoDataUserActivity
import com.example.ciclapp.R
import com.example.ciclapp.database.Auth
import com.example.ciclapp.models.Users


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ProfileFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val correo = arguments?.getString("param1")
        val correo = "luis@gmail.com"
        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        verificarInfoUsuario(correo.toString()) { existeUsuario ->
            if (existeUsuario !== null)  {
                Log.i("Holaaa",existeUsuario.nombre)
                root.findViewById<TextView>(R.id.tUsuario).text = existeUsuario.nombre
                root.findViewById<TextView>(R.id.tCorreo).text = existeUsuario.correo
                root.findViewById<TextView>(R.id.tExperiencia).text = existeUsuario.experiencia
                root.findViewById<TextView>(R.id.tEntreno).text = existeUsuario.nivelEntreno
            }
        }

        return root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String): ProfileFragment {
            val fragment = ProfileFragment()
            val args = Bundle()
            args.putString("param1", param1)
            fragment.arguments = args
            return fragment
        }
    }

    private fun verificarInfoUsuario(correo: String, callback: (Users?) -> Unit) {
        val controlerDatabase = Auth()

        controlerDatabase.getUser(correo) { usuarioEncontrado ->
            callback(usuarioEncontrado)
        }
    }
}