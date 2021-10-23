package com.example.demo.service;

import com.example.demo.entity.Dish;
import com.example.demo.mapper.mysql.DishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(transactionManager = "mysqlTransactionManager")
public class DishService {

    @Autowired
    private DishMapper dishMapper;

    public boolean init() {

        dishMapper.createDB();
        dishMapper.createTable();

        return true;
    }

    public List<Dish> getOne() {
        return dishMapper.selectOne();
    }
}
