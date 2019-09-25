package com.epam;
//Даны действительные числа х и у, не равные друг другу.
// Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.

public class Task15c {
    public static void main(String[] args) {
        double x = 2;
        double y = 5;
        if (x==y) System.out.println("числа равны");
            else if (x<y) {
                double tempX = x;
                x = (tempX+y)/2;
                y = 2*(tempX*y);
                System.out.println("x = " +x+ ", y = " +y);
        }
    }
}
