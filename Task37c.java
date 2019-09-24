//Вычислить значение функции:
// f(x) = -x*x + 3*x + 9, если x>=3
// f(x) = 1/(x*x*x - 6), если x<3


package com.epam;

public class Task37c {
    public static void main(String[] args) {
        int x = 2;
        double f;
        if (x>=3) {
            f = -(Math.pow(x,2)) + (3*x) + 9;}
        else {f = 1/(Math.pow(x,3) - 6);}
        System.out.println("f = " + f);
    }
}
