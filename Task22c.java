//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

package com.epam;

public class Task22c {
    public static void main(String[] args) {
        int x = -5;
        int y = 5;
        int temp;

        if (x>y) System.out.println("х = " +x+ ", y = " +y);

        if (x<y) {
            temp = x;
            x = y;
            y = temp;
            System.out.println("х = " +x+ ", y = " +y);
        }

        if (x==y) System.out.println("числа равны");
    }
}
