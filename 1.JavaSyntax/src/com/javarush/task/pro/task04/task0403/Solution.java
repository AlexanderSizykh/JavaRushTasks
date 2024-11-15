package com.javarush.task.pro.task04.task0403;

import java.io.IOException;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String next = scanner.next();
        while (!next.equals("ENTER")) {
            sum += Integer.parseInt(next);
            next = scanner.next();
        }
        System.out.println(sum);
        }

    }