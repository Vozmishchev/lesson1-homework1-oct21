package ru.gb.homework1;
/* 2.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */



public class SecondWork {
    public static void main(String[] args) {
        System.out.println(summa(20, -7));

    }

    public static boolean summa(int a, int b) {
        int n = a + b;
        if (n >= 10 && n <= 20) return true;
        else return false;
    }



}



