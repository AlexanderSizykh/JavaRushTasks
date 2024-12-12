package com.javarush.task.pro.task11.task1109;

import com.javarush.task.pro.task11.task1109.Outer;
import com.javarush.task.pro.task11.task1109.Outer.Inner;
import com.javarush.task.pro.task11.task1109.Outer.Nested;
/* 
Объекты внутренних и вложенных классов
*/


public class Solution {
    Outer.Nested nested;
    public static void main(String[] args) {
        //напишите тут ваш код
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        Nested nested = new Nested();

    }
}
