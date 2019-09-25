package com.epam;
//Определить, делителем каких чисел а, b, с является число k.

public class Task20c {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = -9;
        int k = 2;
        if(a % k == 0)
            System.out.println (a);
        if(b % k == 0)
            System.out.println (b);
        if(c % k == 0)
            System.out.println (c);
    }
}
