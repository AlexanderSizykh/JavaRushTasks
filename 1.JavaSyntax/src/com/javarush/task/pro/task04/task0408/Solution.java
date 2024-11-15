package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int maxValue = -2147483648;

        while (scanner.hasNextInt()) {
            int nextInt = scanner.nextInt();
            if (nextInt%2 != 0) continue;
            if (maxValue < nextInt) maxValue = nextInt;
        }
        System.out.println(maxValue);

    }
}