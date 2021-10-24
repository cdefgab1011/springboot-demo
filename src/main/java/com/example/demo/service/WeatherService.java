package com.example.demo.service;


import com.example.demo.entity.Weather;
import com.example.demo.mapper.tdengine.WeatherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(transactionManager = "tdengineTransactionManager")
public class WeatherService {

    private final WeatherMapper weatherMapper;

    public boolean init() {

        weatherMapper.createDB();
        weatherMapper.createTable();

        return true;
    }

    public List<Weather> query(Long limit, Long offset) {
        return weatherMapper.select(limit, offset);
    }

    public int save(int temperature, float humidity) {
        Weather weather = new Weather();
        weather.setTemperature(temperature);
        weather.setHumidity(humidity);
        return weatherMapper.insert(weather);
    }

    public int save(List<Weather> weatherList) {
        return weatherMapper.batchInsert(weatherList);
    }

}

