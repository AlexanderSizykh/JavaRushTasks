package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            int[] numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = scanner.nextInt();
            }
            if (N%2 != 0) {
                for (int number : numbers) {
                    System.out.println(number);
                }
            } else {
                for (int i = numbers.length-1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            }
        }


    }
}
