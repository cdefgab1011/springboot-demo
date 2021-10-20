package com.example.demo;

import org.springframework.data.repository.CrudRepository;

interface DishRepository extends CrudRepository<Dish, String> {

}