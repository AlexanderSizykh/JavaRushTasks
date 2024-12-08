package com.javarush.task.pro.task08.task0813;

/* 
Степень двойки
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(2));
    }

    public static int getPowerOfTwo(int power) {
        int i = 2 << power-1;
        return i;
    }
}
