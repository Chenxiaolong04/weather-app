package com.weather.service;

import com.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${openweathermap.api.key}")
    private String apiKey;

    public WeatherResponse getWeather(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city +
                ",IT&appid=" + apiKey + "&units=metric&lang=it";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}
