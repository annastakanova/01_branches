//Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12).
// Если введены некорректные данные, то сообщить об этом.

package com.epam;
import java.util.Scanner;

public class Task23c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц");
        int month = sc.nextInt();

        if (month<1 || month>12) System.out.println("Неверный ввод месяца");
            else System.out.println("Введите день");
                int day = sc.nextInt();
                    if (day<1 || day>31) System.out.println("Неверный ввод дня");

                    else System.out.println("Вы введи дату " +day+ "." +month);


    }
}
