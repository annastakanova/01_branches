package com.epam;
//Написать программу нахождения суммы большего и меньшего из трех чисел.

public class Task26c {
    public static void main(String[] args) {
        int a = 9;
        int b = -6;
        int c = 21;
        int smallest = 0;
        int max = 0;

        if (a < b && a < c) smallest = a;
        else if (b < c && b < a) smallest = b;
        else if (c < a && c < b) smallest = c;
        else System.out.println("имеются равные числа");
        //System.out.println(smallest);

        if (a > b && a > c) max = a;
        else if (b > c && b > a) max = b;
        else if (c > a && c > b) max = c;
        else System.out.println("имеются равные числа");
        //System.out.println(max);

        int result = smallest + max;
        System.out.println("сумма большего и меньшего числа = " +result);
    }
}
