package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = " любит меня.";
        //напишите тут ваш код
        String name = scanner.nextLine();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(name + text);
        }
    }
}
