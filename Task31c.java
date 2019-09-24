//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

package com.epam;

public class Task31c {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int x = 2;
        int y = 8;
        int z = 11;

        if ((a > x && b > y) || (a > x && b > z) || (a > z) && (b > y))
            System.out.println("кирпич пройдет через отверстие");
        else System.out.println("кирпич не пройдет через отверстие");
    }
}
