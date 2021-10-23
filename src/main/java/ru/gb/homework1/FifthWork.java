package ru.gb.homework1;

/* 5.Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 */

import java.util.Scanner;

public class FifthWork {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = x.nextLine();
        System.out.println("Привет," + name + "!");


    }
}
