package com.example.ciclapp.network

import com.example.ciclapp.constant.Const.Companion.openWeatherMapApiKey
import com.example.ciclapp.model.forecast.ForecastResult
import com.example.ciclapp.model.weather.WeatherResult
import retrofit2.http.GET
import retrofit2.http.Query

interface IApiWeatherService {
    @GET("weather")
    suspend fun getWeather(
        @Query("lat") lat: Double = 0.0,
        @Query("lon") lng: Double = 0.0,
        @Query("units") units: String = "metric",
        @Query("appid") appId: String = openWeatherMapApiKey,
    ): WeatherResult

    @GET("forecast")
    suspend fun getForecast(
        @Query("lat") lat: Double = 0.0,
        @Query("lon") lng: Double = 0.0,
        @Query("units") units: String = "metric",
        @Query("appid") appId: String = openWeatherMapApiKey,
    ): ForecastResult
}