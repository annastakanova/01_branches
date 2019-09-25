package com.epam;
//Вычислить значение функции:
// f(x) = x*x, если x>=0 и х<=3    //не исп
// f(x) = 4, если x>3 или х<0

public class Task38c {
    public static void main(String[] args) {
        int x = 1;
        int f;
        if (x>3 || x<0) {
            f = (int)Math.pow(x,2);
        }
        else {f = 4;
        }
        System.out.println("f = " + f);
    }
}
