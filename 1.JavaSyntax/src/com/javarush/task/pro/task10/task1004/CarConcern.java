package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String DEFAULT_MODEL = "Unknown";
    private final String DEFAULT_COLOR = "Оранжевый";
    private final int DEFAULT_YEAR = 4321;
    private String model;
    private int year;
    private String color;

    public CarConcern(String model, int year, String color) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = DEFAULT_COLOR;
    }

    public CarConcern(String model) {
        //напишите тут ваш код
        this.model = model;
        this.year = DEFAULT_YEAR;
        this.color = DEFAULT_COLOR;
    }
}
