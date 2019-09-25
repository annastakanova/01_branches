package com.epam;
//Вычислить значение функции:
// f(x) = -x*x + x - 9, если x>=8
// f(x) = 1/(Math.pow(x, 4) - 6), если x<8

public class Task39c {
    public static void main(String[] args) {
        int x = 3;
        double f;
        if (x>=8) {
            f = (-Math.pow(x, 2)) + x - 9;}
        else {f = 1/(Math.pow(x, 4) - 6);}
        System.out.println("f = " + f);
    }
}
