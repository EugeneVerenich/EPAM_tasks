/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        sum_fact();

    }

    static int factorial(int a){
        int fact = 1;
        if (a != 0)
          fact = a * factorial(a-1);

        return fact ;
    }

    static void sum_fact(){
        int sum = 0;
        for (int i = 1; i < 10 ; i++) {
            if (i % 2 != 0)
                sum += factorial(i);
        }

        System.out.println("Сумма факториалов : " + sum);

    }

}
