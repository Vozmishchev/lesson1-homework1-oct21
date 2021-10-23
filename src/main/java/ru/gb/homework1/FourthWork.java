package ru.gb.homework1;

/*4.Написать метод, которому в качестве параметра передается целое число.
   Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 */

public class FourthWork {
    public static void main(String[] args) {
        System.out.println(lol(-10));

    }
    public static boolean lol(int a) {
        if (a < 0 ) return true;
        else return false;

    }

}