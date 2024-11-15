package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int cans = scanner.nextInt();
        int people = scanner.nextInt();

        System.out.println(cans * 1.0 / people);
    }
}