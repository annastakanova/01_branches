package com.epam;
//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
// В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».

import java.util.Scanner;

public class Task21c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
        String sex = sc.nextLine();

        if (sex.matches("Д"))
            System.out.println("Мне нравятся девочки!");
        if (sex.matches("М"))
            System.out.println("Мне нравятся мальчики!");
        else
            System.out.println("Неверный ввод");
    }
}
