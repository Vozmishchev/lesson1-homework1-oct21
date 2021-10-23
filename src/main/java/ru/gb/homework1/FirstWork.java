package ru.gb.homework1;

public class FirstWork {
/*1.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
   где a, b, c, d – аргументы этого метода, имеющие тип float.
 */
    public static void main(String[] args) {


        float x = equation(10, 20,50,3);

        System.out.println("a * (b + (c / d ) = " + x);
    }

        public static float equation(float a, float b, float c, float d) {

         return a * (b + (c / d )) ;


        }

    }

