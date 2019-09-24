//Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных.
// Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа.
// Они имеют следующие пароли:
// 9583, 1747 — доступны модули баз А, В, С;
// 3331, 7922 — доступны модули баз В, С;
// 9455, 8997 — доступен модуль базы С.

package com.epam;
import java.util.Scanner;

public class Task33c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль");
        int passw = sc.nextInt();

        if (passw == 9583 || passw == 1747)
            System.out.println("доступны модули баз А, В, С");
        if (passw == 3331 || passw == 7922)
            System.out.println("доступны модули баз В, С");
        if (passw == 9455 || passw == 8997)
            System.out.println("доступны модуль базы С");
        else System.out.println("доступ запрещен!!!");
    }
}
