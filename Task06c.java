package com.epam;
//Составить программу: определения наибольшего из двух чисел а и b

public class Task06c {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        if (a>b)
            System.out.println("наибольшее число = " +a);
        else
        if (b>a)
            System.out.println("наибольшее число = " +b);
        else
        if (a==b)
            System.out.println("наибольшего нет, числа равны");
    }
}

