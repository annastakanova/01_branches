//Составить программу сравнения введенного числа а и цифры 3.
// Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».

package com.epam;

import java.util.Scanner;

public class Task03c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Ведите a: ");
        int a = sc.nextInt();

        if (a<3)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
