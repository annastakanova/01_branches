package com.epam;
//Составить программу нахождения наименьшего из квадратов двух чисел а и b

//по сути, можно сравнивать и сами числа, а не квадраты, и выводить ответ про их квадраты

public class Task08c {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int a2 = a*a;
        int b2 = b*b;
        if (a2<b2)
            System.out.println("наименьший квадрат числа = " +a2);
        else
        if (a2>b2)
            System.out.println("наименьший квадрат числа = " +b2);
        else
        if (a2==b2)
            System.out.println("наименьшего нет, квадраты чисел равны");
    }
}
