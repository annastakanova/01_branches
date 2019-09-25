package com.epam;
//Вычислить значение функции:
// f(x) = -Math.pow(x, 3) + 9, если x<=13
// f(x) = -3 / (x + 1), если x>13

public class Task40c {
    public static void main(String[] args) {
        int x = 100;
        double f;

        if (x<=13) {
            f = - Math.pow(x, 3) + 9;}

        else f = (double)(-3) / (x + 1);

        System.out.println("f = " + f);
    }
}
