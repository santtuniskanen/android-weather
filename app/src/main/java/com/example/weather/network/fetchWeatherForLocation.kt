package com.example.weather.network

import com.example.weather.model.WeatherResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun fetchWeatherForLocation(
    location: String,
    apiKey: String): WeatherResponse {
        return withContext(Dispatchers.IO) {
            WeatherApiService.weatherApi.getCurrentWeather(location, apiKey)
        }
}