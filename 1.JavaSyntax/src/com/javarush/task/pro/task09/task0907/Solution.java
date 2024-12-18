package com.javarush.task.pro.task09.task0907;

import java.util.Objects;
import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишите тут ваш код
        if (decimalNumber <= 0) return "";
        String hexNumber = "";
        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber%16) + hexNumber;
            decimalNumber = decimalNumber/16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        //напишите тут ваш код
        if (Objects.isNull(hexNumber) || hexNumber.isEmpty()) return 0;
        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char a = hexNumber.charAt(hexNumber.length()-1-i);
            int numericValue = HEX.indexOf(a);
            decimalNumber = decimalNumber + numericValue * (int) Math.pow(16, i);
        }
        return decimalNumber;
    }

}
