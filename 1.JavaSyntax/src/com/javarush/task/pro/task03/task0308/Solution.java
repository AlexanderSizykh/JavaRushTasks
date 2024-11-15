package com.javarush.task.pro.task03.task0308;

import java.util.Scanner;

/* 
Координатные четверти
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int quarter = 0;
        if (x > 0 && y > 0) quarter = 1;
        if (x < 0 && y > 0) quarter = 2;
        if (x < 0 && y < 0) quarter = 3;
        if (x > 0 && y < 0) quarter = 4;

        System.out.println(quarter);

    }
}
