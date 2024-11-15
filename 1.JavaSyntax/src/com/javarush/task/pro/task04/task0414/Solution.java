package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String printString = scanner.nextLine();

        int number = scanner.nextInt();
        if (number <= 0 || number >= 5) {
            number = 1;
        }

        do {
            number--;
            System.out.println(printString);
        } while (number > 0);
    }
}