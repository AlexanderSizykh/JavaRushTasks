package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int first = 0; first < multiArray.length; first++) {
            for (int second = 0; second < multiArray[first].length; second++) {
                for (int third = 0; third < multiArray[first][second].length; third++) {
                    System.out.println(multiArray[first][second][third]);
                }
            }
        }
    }
}
