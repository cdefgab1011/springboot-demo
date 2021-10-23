package com.example.demo.controller;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    /**
     * create database and table
     * @return
     */
    @GetMapping("/init")
    public boolean init(){
        return weatherService.init();
    }

    /**
     * Pagination Query
     * @param limit
     * @param offset
     * @return
     */
    @GetMapping("/{limit}/{offset}")
    public List<Weather> queryWeather(@PathVariable Long limit, @PathVariable Long offset){
        return weatherService.query(limit, offset);
    }

    /**
     * upload single weather info
     * @param temperature
     * @param humidity
     * @return
     */
    @GetMapping("/save/{temperature}/{humidity}")
    public int saveWeather(@PathVariable int temperature, @PathVariable float humidity){

        return weatherService.save(temperature, humidity);
    }

    /**
     * upload multi weather info
     * @param weatherList
     * @return
     */
    @PostMapping("/batch")
    public int batchSaveWeather(@RequestBody List<Weather> weatherList){

        return weatherService.save(weatherList);
    }

}
