package com.example.demo.controller;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/init")
    @ApiOperation(value = "初始化数据库和表", notes = "备注")
    public boolean init() {
        return weatherService.init();
    }

    @GetMapping("/{limit}/{offset}")
    public List<Weather> queryWeather(@PathVariable Long limit, @PathVariable Long offset) {
        return weatherService.query(limit, offset);
    }

    @GetMapping("/save/{temperature}/{humidity}")
    public int saveWeather(@PathVariable int temperature, @PathVariable float humidity) {

        return weatherService.save(temperature, humidity);
    }

    @PostMapping("/batch")
    public int batchSaveWeather(@RequestBody List<Weather> weatherList) {
        return weatherService.save(weatherList);
    }

}
