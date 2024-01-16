package com.example.ciclapp.constant

class Const {
    companion object {
        var permissions = arrayOf(
            android.Manifest.permission.ACCESS_COARSE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )

        const val openWeatherMapApiKey = "c7666bd8f51e323984b3b3aaf8a2553e"

        const val colorBg1 = 0xff277be3
        const val colorBg2 = 0xff7eb0ee
        const val cardColor = 0xFF3986e5

        const val LOADING = "Cargando..."
        const val NA = "N/A"

    }
}