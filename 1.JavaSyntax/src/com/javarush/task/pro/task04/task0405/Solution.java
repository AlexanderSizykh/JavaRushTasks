package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int height = 10;
        System.out.println("ББББББББББББББББББББ");
        while (height-2 > 0) {
            int width = 20;
            System.out.print("Б");
            while (width-2 > 0) {
                System.out.print(" ");
                width--;
            }
            System.out.print("Б");
            System.out.println();
            height--;
        }
        System.out.println("ББББББББББББББББББББ");

    }
}