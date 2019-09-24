//Написать программу — модель анализа пожарного датчика в помещении,
//которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.

package com.epam;

public class Task25c {
    public static void main(String[] args) {
        double t = 61;
        if (t>60) System.out.println("Пожароопасная ситуация");
        else System.out.println("Пожароопасной ситуации нет");
    }
}
