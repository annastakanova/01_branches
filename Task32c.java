//Написать программу, которая по заданным трем числам определяет,
// является ли сумма каких-либо двух из них положительной.

package com.epam;

public class Task32c {
    public static void main(String[] args) {
        int a = -5;
        int b = -6;
        int c = 6;
        if (a+b > 0)
            System.out.println("a+b > 0");
        if (b+c > 0)
            System.out.println("b+c > 0");
        if (a+c > 0)
            System.out.println("a+c > 0");
        else System.out.println("любая из сумм отрицательна либо равна 0");
    }
}
