//Даны две точки А(х1, у1) и В(х2, у2).
// Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

package com.epam;

public class Task13c {
    public static void main(String[] args) {
        int x1 = 4;
        int y1 = -3;
        double l1 = (Math.sqrt(x1*x1 + y1*y1));
        int x2 = 5;
        int y2 = 10;
        double l2 = (Math.sqrt(x2*x2 + y2*y2));

        if (l1<l2) System.out.println("точка 1 ближе к началу координат");
            else  if (l2<l1) System.out.println("точка 2 ближе к началу координат");
            else System.out.println("точки находятся на одинаковом расстоянии до начала координат");
    }
}
