package com.epam;
//Составить программу, которая определит площадь какого треугольника больше

public class Task11c {
    public static void main(String[] args) {
        int a1 = 9;
        int h1 = 5;
        int a2 = 11;
        int h2 = 2;

        if (a1*h1/2<a2*h2/2)
            System.out.println("площадь треугольника 1 меньше");
        else
        if (a1*h1/2>a2*h2/2)
            System.out.println("площадь треугольника 2 меньше");

        else
        if (a1*h1/2==a2*h2/2)
            System.out.println("площади треугольников равны");
    }
}
