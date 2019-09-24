//Подсчитать количество положительных среди чисел а, b, с.

package com.epam;

public class Task19c {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = -6;
        int quantity = 0;
        if (a>0) quantity ++;
        if (b>0) quantity ++;
        if (c>0) quantity ++;
        System.out.println("количество положительных чисел: " +quantity);
    }
}
