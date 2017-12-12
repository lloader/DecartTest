package com.lloader;

import java.util.Random;

public class Car implements Randomized, Comparable<Car> {
    private CarName name;
    private Color color;
    private NumberPlate numberPlate;

    public Car() {

    }

    public CarName getName() {
        return name;
    }

    public void setName(CarName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + numberPlate.toString();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public NumberPlate getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(NumberPlate numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void randomize() {
        final Random random = new Random();
        final CarName carName = CarName.values()[random.nextInt(CarName.values().length)];
        final Color color = Color.values()[random.nextInt(Color.values().length)];
        final NumberPlate numberPlate = new NumberPlate();
        numberPlate.randomize();

        this.name = carName;
        this.color = color;
        this.numberPlate = numberPlate;
    }

    @Override
    public int compareTo(Car o) {
        return numberPlate.compareTo(o.numberPlate);
    }
}
