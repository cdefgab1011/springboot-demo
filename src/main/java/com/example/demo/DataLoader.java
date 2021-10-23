//package com.example.demo;
//
//import com.example.demo.entity.Dish;
//import com.sun.tools.javac.util.List;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//class DataLoader {
//    private final DishRepository dishRepository;
//
//    public DataLoader(DishRepository dishRepository) {
//        this.dishRepository = dishRepository;
//    }
//
//    @PostConstruct
//    private void loadData() {
//        dishRepository.deleteAll();
//
//        dishRepository.saveAll(List.of(
//                new Dish(1, "豆浆油条"),
//                new Dish(2, "辣椒炒肉"),
//                new Dish(2, "番茄炒蛋")
//        ));
//    }
//}