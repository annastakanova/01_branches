package com.epam;
//Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.

public class Task09c {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 7;
        if ((a==b) || (a==c) || (b==c))
            System.out.println("треугольник является равнобедренным");
        else
            System.out.println("треугольник не является равнобедренным");
    }
}
