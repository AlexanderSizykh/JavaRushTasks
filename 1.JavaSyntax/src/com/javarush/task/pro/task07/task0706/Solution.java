package com.javarush.task.pro.task07.task0706;

/* 
Странное деление
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double infinity = 1d / 0d;

        div(infinity,infinity);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
