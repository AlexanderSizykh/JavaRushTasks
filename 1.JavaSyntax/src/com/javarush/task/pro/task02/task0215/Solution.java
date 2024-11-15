package com.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Чтение чисел
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        System.out.println(sum/3);
    }
}
