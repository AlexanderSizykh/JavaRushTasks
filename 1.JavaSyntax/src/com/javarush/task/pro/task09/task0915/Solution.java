package com.javarush.task.pro.task09.task0915;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        int tokensCount = tokenizer.countTokens();
        String[] tokens = new String[tokensCount];

        for (int i = 0; i < tokensCount; i++) {
            tokens[i] = tokenizer.nextToken();
            System.out.println(tokens[i]);

        }

        return tokens;
    }
}
