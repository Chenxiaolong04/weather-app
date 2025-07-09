package com.weather.controller;

import com.weather.model.WeatherResponse;
import com.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    private final String[] cities = {"Roma", "Milano", "Torino", "Napoli", "Firenze", "Bologna", "Palermo", "Genova"};

    @GetMapping("/")
    public String index(Model model, @RequestParam(required = false) String city) {
        model.addAttribute("cities", cities);
        if (city != null && !city.isEmpty()) {
            WeatherResponse weather = weatherService.getWeather(city);
            model.addAttribute("weather", weather);
            model.addAttribute("selectedCity", city);
        }
        return "index";
    }
}
