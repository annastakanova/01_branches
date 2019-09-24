//Составить программу, реализующую эпизод применения компьютера в книжном магазине.
// Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
// если сдачи не требуется, печатает на экране «спасибо»;
// если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи;
// если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.

package com.epam;
import java.util.Scanner;

public class Task34c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость книг");
        int price = sc.nextInt();
        System.out.println("Введите сумму денег, внесенную покупателем");
        int sum = sc.nextInt();
        if (price==sum) System.out.println("спасибо");
        else if (price<sum) System.out.println("cдача = " + (sum - price));
        else if (price>sum) System.out.println("недостающая сумма = " + (price - sum));
    }
}
