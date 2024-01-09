package com.example.ciclapp.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ciclapp.model.MyLatLng
import com.example.ciclapp.model.forecast.ForecastResult
import com.example.ciclapp.model.weather.WeatherResult
import com.example.ciclapp.network.RetrofitClient
import kotlinx.coroutines.launch
import java.lang.Exception

enum class STATE {
    LOADING,
    SUCCESS,
    FAILED
}

//MAIN VIEW MODEL OF WEATHER SECTION
class MainViewModel : ViewModel() {
    var state by mutableStateOf(STATE.LOADING) // Control de estado de vista
    // Valores del Clima desde la API
    var weatherResponse : WeatherResult by mutableStateOf(WeatherResult())
    // Valores del Pronostico desde la API
    var forecastResponse : ForecastResult by mutableStateOf(ForecastResult())
    var errorMessage : String by mutableStateOf("")

    fun getWeatherByLocation(latlng: MyLatLng){
        Log.d("JESUS", "API IS HERE !!!!!!!!!!!!!")
        viewModelScope.launch {
            state = STATE.LOADING
            val apiService = RetrofitClient.getInstance()
            try {
                val apiResponse = apiService.getWeather(latlng.lat, latlng.lng)
                weatherResponse = apiResponse
                state = STATE.SUCCESS
            }catch (e: Exception) {
                errorMessage = e.message!!.toString()
                state = STATE.FAILED
            }
        }
    }

    fun getForecastByLocation(latlng: MyLatLng){
        viewModelScope.launch {
            state = STATE.LOADING
            val apiService = RetrofitClient.getInstance()
            try {
                val apiResponse = apiService.getForecast(latlng.lat, latlng.lng)
                forecastResponse = apiResponse
                state = STATE.SUCCESS
            }catch (e: Exception) {
                errorMessage = e.message!!.toString()
                state = STATE.FAILED
            }
        }
    }

}