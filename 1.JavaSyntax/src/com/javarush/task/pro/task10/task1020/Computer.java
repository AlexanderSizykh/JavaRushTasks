package com.javarush.task.pro.task10.task1020;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private SystemUnit systemUnit;
    public Computer() {
        keyboard = new Keyboard();
        monitor = new Monitor();
        mouse = new Mouse();
        systemUnit = new SystemUnit();
    }
}
