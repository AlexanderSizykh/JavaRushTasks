package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (!(obj instanceof Iphone)) return false;

        Iphone iphone = (Iphone) obj;
        return Objects.equals(this.model, iphone.model)  &&
                Objects.equals(this.color, iphone.color)  &&
                Objects.equals(this.price, iphone.price);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        Iphone iphone3 = iphone1;

        System.out.println(iphone1.equals(iphone2));

    }

}
