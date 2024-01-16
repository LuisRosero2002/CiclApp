package com.example.ciclapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.add
import androidx.fragment.app.replace
import com.example.ciclapp.databinding.ActivityHomeBinding
import com.example.ciclapp.fragments.HomeFragment
import com.example.ciclapp.fragments.ProfileFragment
import com.example.ciclapp.fragments.TravelFragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class HomeActivity : AppCompatActivity() , OnMapReadyCallback {

    private lateinit var binding: ActivityHomeBinding
    lateinit var navigation :BottomNavigationView
    private var mapFragment: SupportMapFragment? = null
    private lateinit var map: GoogleMap

    private val bottomNavigationView =  BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.btnViajar -> {

                supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
                if (mapFragment == null) {
                    mapFragment = SupportMapFragment()
                }
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<TravelFragment>(R.id.fragmetContainer)
                    addToBackStack(null)
                }
                mapFragment?.getMapAsync(this)

                return@OnNavigationItemSelectedListener true
            }
            R.id.btnPerfil -> {
                val correo = intent.getStringExtra("correo")

                val fragment = ProfileFragment.newInstance(correo)
                supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<ProfileFragment>(R.id.fragmetContainer)
                }


                return@OnNavigationItemSelectedListener true
            }
            R.id.btnInicio -> {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<HomeFragment>(R.id.fragmetContainer)
                }
                return@OnNavigationItemSelectedListener true
            }
            else -> false
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Verificación de extras en el Intent
        val extras = intent.extras
        if (extras != null) {
            for (key in extras.keySet()) {
                Log.d("JESUS", "Extra en Intent: $key")
            }
        }

        initHome()

    }

    private fun initHome() {

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<HomeFragment>(R.id.fragmetContainer)
        }

        navigation = findViewById(R.id.navMenu)
        navigation.setOnNavigationItemSelectedListener(bottomNavigationView)

    }

    override fun onMapReady(googleMaps: GoogleMap) {
        map = googleMaps
        val coordenadas = LatLng(1.216611, -77.293663)
        val marker: MarkerOptions = MarkerOptions().position(coordenadas).title("Mi ubicacion")
        map.addMarker(marker)
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadas, 18f), 4000, null)

    }

     private fun createMarker() {
         val coordenadas = LatLng(1.216611, -77.293663)
         val marker: MarkerOptions = MarkerOptions().position(coordenadas).title("Mi ubicacion")
         map.addMarker(marker)
         map.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadas, 18f), 4000, null)

    }

}