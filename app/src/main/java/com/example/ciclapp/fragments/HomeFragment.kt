package com.example.ciclapp.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.ciclapp.HomeActivity
import com.example.ciclapp.R
import com.example.ciclapp.TrainingActivity
import com.example.ciclapp.WeatherActivity


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
class HomeFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var correo: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        arguments?.let {
            correo = it.getString("correo")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val cardTraining = root.findViewById<CardView>(R.id.cardTraining)

        // Obtener el correo del argumento
        val correo = (activity as? HomeActivity)?.intent?.getStringExtra("correo")
        Log.d("JESUS", "Correo en HomeFragment: $correo")

        cardTraining.setOnClickListener {
            val intent = Intent(requireContext(), TrainingActivity::class.java)
            intent.putExtra("correo", correo)
            startActivity(intent)
        }

        return root
    }

    companion object {
        @JvmStatic
        fun newInstance(correo: String?) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString("correo", correo)
                }
            }

        //fun newInstance(correo: String?): ProfileFragment {
        //    val fragment = ProfileFragment()
        //    val args = Bundle()
        //    args.putString("correo", correo)
        //    fragment.arguments = args
        //    return fragment
        //}
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cardWeather = view.findViewById<CardView>(R.id.cardWeather)

        cardWeather.setOnClickListener {
            onCardClick(it)
        }
    }
    fun onCardClick(view: View) {
        when (view.id) {
            R.id.cardWeather -> {
                // showToast("Clic en la tarjeta del clima")
                val intent = Intent(context, WeatherActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}