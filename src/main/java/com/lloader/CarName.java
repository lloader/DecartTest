package com.lloader;

public enum  CarName {
    VOLVO("Вольво"), LADA("Лада"), SUZUKI("Сузуки"), HONDA("Хонда"), DEO("Део"), MITSUBISHI("Митсубиши");

    private String name;

    CarName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
