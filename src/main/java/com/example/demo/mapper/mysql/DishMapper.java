package com.example.demo.mapper.mysql;

import com.example.demo.entity.Dish;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DishMapper {

    void createDB();

    void createTable();

    List<Dish> selectOne();
}
