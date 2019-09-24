//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

package com.epam;

public class Task07c {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = -9;
        int x = 7;
        int f = Math.abs(a * x * x + b * x + c);
        System.out.println("модуль выражения = " + f);
    }
}
