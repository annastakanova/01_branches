//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

package com.epam;

public class Task29c {
    public static void main(String[] args) {
        // vectorAB (x2-х1; y2-y1)
        // vectorAС (x3-х1; y3-y1)
        // если векторы коллинеарны (x2-х1/x3-х1) == (y2-y1/y3-y1), то точки лежат на одной прямой

        int х1 = 2, x2 = 4, x3 = 8;
        int y1 = 3, y2 = 6, y3 = 12;

        if ((x2-х1)/(x3-х1) == (y2-y1)/(y3-y1))
            System.out.println("точки лежат на одной прямой");
        else
            System.out.println("точки не лежат на одной прямой");
    }
}


