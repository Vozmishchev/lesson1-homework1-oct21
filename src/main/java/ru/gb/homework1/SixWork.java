package ru.gb.homework1;

import java.util.Scanner;

/*6.Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class SixWork {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Введите год : ");
        int n = x.nextInt();

        if (n % 100==0 && n % 400 ==0 )
            System.out.println("високосный");

        else if (n % 4 == 0 && n % 100 > 0)
            System.out.println("високосный");

        else if (n % 100 == 0)
            System.out.println("не високосный");

        else
            System.out.println(" не високосный");

        }
    }








