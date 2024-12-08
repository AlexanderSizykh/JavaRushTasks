package com.javarush.task.pro.task09.task0908;

import java.util.Objects;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишите тут ваш код
        String regex = "^[01]+$";
        if (Objects.isNull(binaryNumber) || binaryNumber.isEmpty() || !binaryNumber.matches(regex)) return "";
        return decimalToHex(binaryToDecimal(binaryNumber));
    }

    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        String regex = "^[0-9a-f]+$";
        if (Objects.isNull(hexNumber) || hexNumber.isEmpty() || !hexNumber.matches(regex)) {
            return "";
        }
        return decimalToBinary(hexToDecimal(hexNumber));
    }

    public static int hexToDecimal(String hexNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char a = hexNumber.charAt(hexNumber.length()-1-i);
            int numericValue = HEX.indexOf(a);
            decimalNumber = decimalNumber + numericValue * (int) Math.pow(16, i);
        }
        return decimalNumber;
    }

    public static String decimalToBinary(int decimalNumber) {
        //напишите тут ваш код
        String binaryNumber = "";
        while (decimalNumber != 0) {
            binaryNumber = decimalNumber%2 + binaryNumber;
            decimalNumber = decimalNumber/2;
        }
        return binaryNumber;
    }

    public static int binaryToDecimal(String binaryNumber) {
        //напишите тут ваш код
        int decimalNumber = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            char a = binaryNumber.charAt(binaryNumber.length()-1-i);
            int numericValue = Character.getNumericValue(a);
            decimalNumber = decimalNumber + numericValue * (int) Math.pow(2, i);
        }
        return decimalNumber;
    }

    public static String decimalToHex(int decimalNumber) {
        //напишите тут ваш код
        String hexNumber = "";
        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber%16) + hexNumber;
            decimalNumber = decimalNumber/16;
        }
        return hexNumber;
    }
}
