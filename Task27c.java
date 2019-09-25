package com.epam;
//Найти max{ min(a, b), min(c, d)}.

public class Task27c {
    public static void main(String[] args) {
        int a = 9;
        int b = -6;
        int c = 21;
        int d = 1;

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int result = Math.max(min1, min2);
        System.out.println(result);
    }
}
