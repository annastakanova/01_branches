package com.epam;
//Составить программу, определяющую результат гадания на ромашке — «любит—не любит»,
// взяв за исходное данное количество лепестков п.

public class Task24c {
    public static void main(String[] args) {
        int n = 25;
        if (n%2 ==0) System.out.println("не любит :(");
        else System.out.println("любит :)");
    }
}
