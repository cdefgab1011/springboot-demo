package com.example.demo.controller;

import com.example.demo.entity.Dish;
import com.example.demo.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dish")
public class DishController {

    private final DishService dishService;

    @GetMapping("/init")
    public boolean init() {
        return dishService.init();
    }

    @GetMapping("/getOneDish")
    public Iterable<Dish> getOneDishes() {
        return dishService.getOne();
    }
}
