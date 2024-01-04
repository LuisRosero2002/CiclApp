package com.example.ciclapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.add
import androidx.fragment.app.replace
import com.example.ciclapp.databinding.ActivityHomeBinding
import com.example.ciclapp.fragments.HomeFragment
import com.example.ciclapp.fragments.ProfileFragment
import com.example.ciclapp.fragments.TravelFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    lateinit var navigation :BottomNavigationView

    private val bottomNavigationView =  BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.btnViajar -> {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<TravelFragment>(R.id.fragmetContainer)
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.btnPerfil -> {
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

}