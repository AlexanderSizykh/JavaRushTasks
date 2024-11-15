package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int height = 5;
        while (height > 0) {
            int width = 10;
            while (width > 0) {
                System.out.print("Q");
                width--;
            }
            System.out.println();
            height--;
        }
    }
}