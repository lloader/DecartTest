package com.lloader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Создаем список из 20 автомобилей заполненных случайными данными
        List<Car> cars = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            Car car = new Car();
            car.randomize();
            cars.add(car);
        }
        //Создаем коллекцию Map(ключ -> значение)
        //Ключом в ней будет цвет, а значением список машин с этим цветом
        final Map<Color, List<Car>> map = new HashMap<>();
        for(Color color : Color.values()) {
            List<Car> coloredCars = new ArrayList<>();
            for(Car car : cars) {
                if(car.getColor() == color) {
                    coloredCars.add(car);
                }
            }
            coloredCars.sort((Car::compareTo));
            map.put(color, coloredCars);
        }
        //Выводим список на экран
        map.forEach(((color, carsList) -> {
            carsList.forEach(car -> {
                System.out.println(color.getName()+ " - " + car.toString());
            });
        }));

    }
}
