//Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

package com.epam;

public class Task14c {
    public static void main(String[] args) {
        int angle1 = 90;
        int angle2 = 30;

        if (angle1 + angle2 < 180) {
            System.out.print("такой треугольник существует");
                if (angle1 == 90 | angle2 == 90 | angle1 + angle2 == 90)
                System.out.println(" и является прямоугольным");
        }
    }
}
