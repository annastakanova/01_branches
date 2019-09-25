package com.epam;
//Составить программу: определения наименьшего из двух чисел а и b.

public class Task05c {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        if (a<b)
            System.out.println("наименьшее число = " +a);
        else
            if (a>b)
                System.out.println("наименьшее число = " +b);
        else
            if (a==b)
                System.out.println("наименьшего нет, числа равны");
    }
}
