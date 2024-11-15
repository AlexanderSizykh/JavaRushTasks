package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
//        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int firstMinValue = scanner.nextInt();
        int secondMinValue = scanner.nextInt();

        if (firstMinValue > secondMinValue) {
            int temp = secondMinValue;
            secondMinValue = firstMinValue;
            firstMinValue = temp;
        }

        while (scanner.hasNextInt()) {
            int next = scanner.nextInt();
            if (firstMinValue == secondMinValue && next > firstMinValue) {
                secondMinValue = next;
            } else if (next < firstMinValue) {
                secondMinValue = firstMinValue;
                firstMinValue = next;
            } else if (next > firstMinValue && next < secondMinValue) {
                secondMinValue = next;
            }
        }
        System.out.println(secondMinValue);


    }
}