package com.example.demo.service;

import com.example.demo.entity.Dish;
import com.example.demo.mapper.mysql.DishMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(transactionManager = "mysqlTransactionManager")
public class DishService {

    private final DishMapper dishMapper;

    public boolean init() {

        dishMapper.createDB();
        dishMapper.createTable();

        return true;
    }

    public List<Dish> getOne() {
        return dishMapper.selectOne();
    }
}
