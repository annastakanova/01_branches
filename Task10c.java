//Составить программу, которая определит площадь какого круга меньше

//по каким вводным данным вычисляется площадь? или она уже дана?

package com.epam;

public class Task10c {
    public static void main(String[] args) {
        int radius1 = 3;
        int radius2 = 5;
        double area1 = Math.PI*radius1;
        double area2 = Math.PI*radius2;

        if (area1<area2)
            System.out.println("площадь круга 1 меньше");
        else
            if (area1>area2)
            System.out.println("площадь круга 2 меньше");

            else
            if (area1==area2)
                System.out.println("площади кругов равны");
    }
}
