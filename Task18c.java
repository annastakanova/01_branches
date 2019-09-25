package com.epam;
//Подсчитать количество отрицательных среди чисел а, b, с.

public class Task18c {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = -6;
        int quantity = 0;
        if (a<0) quantity ++;
        if (b<0) quantity ++;
        if (c<0) quantity ++;
        System.out.println("количество отрицательных чисел: " +quantity);
    }
}
