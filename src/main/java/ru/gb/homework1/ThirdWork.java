package ru.gb.homework1;
/* 3.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
       в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */
import java.util.Scanner;

public class ThirdWork {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Введите число: ");
        int b = a.nextInt();

        if (b >= 0) {
            System.out.println("Число положительное");
        } else { System.out.println("Число отрицательное"); }



    }
}
