package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double S = pi * r * r;
        System.out.println((int) S);

    }
}