package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firtString = scanner.nextLine();
        String secondString = scanner.nextLine();

        //напишите тут ваш код
        if (firtString.equals(secondString)) {
            System.out.println("строки одинаковые");
        } else System.out.println("строки разные");
    }
}
