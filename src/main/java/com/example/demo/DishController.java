package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DishController {

    private final DishRepository dishRepository;

    @GetMapping("/getAllDishes")
    public Iterable<Dish> getAllDishes() {
        return dishRepository.findAll();
    }
}
