package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();
        int thirdInt = scanner.nextInt();

        if (firstInt == secondInt && firstInt == thirdInt) {
            System.out.println(firstInt + " " + secondInt + " " + thirdInt);
        } else if (firstInt == secondInt) {
            System.out.println(firstInt + " " + secondInt);
        } else if (firstInt == thirdInt) {
            System.out.println(firstInt + " " + thirdInt);
        } else if (secondInt == thirdInt) {
            System.out.println(secondInt + " " + thirdInt);
        }
    }
}
