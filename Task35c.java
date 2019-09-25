package com.epam;
//Вычислить число и месяц в невисокосном году по номеру дня.

import java.util.Scanner;

public class Task35c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер дня");
        int dayNum = sc.nextInt();

        while (dayNum > 0) {
            if (dayNum <= 31){
                System.out.println(dayNum + "января");
                break;
            }
            dayNum -= 31;

            if (dayNum <= 28) {
                System.out.println(dayNum + "февраля");
                break;
            }
            dayNum -= 28;

            if (dayNum <= 31) {
                System.out.println(dayNum + "марта");
                break;
            }
            dayNum -= 31;

            if (dayNum <= 30) {
                System.out.println(dayNum + "апреля");
                break;
            }
            dayNum -= 30;

            if (dayNum <= 31) {
                System.out.println(dayNum + "мая");
                break;
            }
            dayNum -= 31;

            if (dayNum <= 30) {
                System.out.println(dayNum + "июня");
                break;
            }
            dayNum -= 30;

            if (dayNum <= 31) {
                System.out.println(dayNum + "июля");
                break;
            }
            dayNum -= 31;

            if (dayNum <= 30) {
                System.out.println(dayNum + "августа");
                break;
            }
            dayNum -= 30;

            if (dayNum <= 31) {
                System.out.println(dayNum + "сентября");
                break;
            }
            dayNum -= 31;

            if (dayNum <= 30) {
                System.out.println(dayNum + "октября");
                break;
            }
            dayNum -= 30;


            if (dayNum <= 31) {
                System.out.println(dayNum + "ноября");
                break;
            }
            dayNum -= 31;

            if (dayNum <= 30) {
                System.out.println(dayNum + "декабря");
                break;
            }
            dayNum -= 30;

            if (dayNum > 0) System.out.println("введенное число больше количесва дней в году");
        }
    }
}
