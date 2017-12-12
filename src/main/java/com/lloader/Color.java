package com.lloader;

public enum Color {
    RED("Красный"), GREEN("Зеленый"), BLUE("Синий"), WHITE("Белый"), BLACK("Черный"), ORANGE("Оранжевый");

    private String name;

    Color(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
