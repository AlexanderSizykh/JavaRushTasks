package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        String startPath = path.substring(0, path.indexOf("jdk"));

        String endPathTemp = path.substring(path.indexOf("jdk"));
        String endPath = endPathTemp.substring(endPathTemp.indexOf("/"));

        return startPath + jdk + endPath;
    }
}
