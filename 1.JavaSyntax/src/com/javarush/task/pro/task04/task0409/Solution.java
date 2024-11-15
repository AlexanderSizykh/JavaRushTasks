package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int minvalue = 2147483647;

        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();

            if (minvalue > x) {
                minvalue = x;
            }
        }
        System.out.println(minvalue);
    }
}