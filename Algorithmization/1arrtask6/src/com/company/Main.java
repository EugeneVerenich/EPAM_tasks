package com.company;

import java.util.Scanner;
import java.util.Random;
/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the dimension of the array : ");
        int n = in.nextInt();
        double[] array = new double[n+1];
        // заполняем массив случайными числами
        for(int i = 1;i <= n;i++){
            array[i] = random.nextDouble();
            System.out.println(array[i] + " ");
        }

        // суммируем простые числа
        double sum = array[2];
        for(int i = 3;i <= n;i+=2){
                sum += array[i];
        }

        // выводим сумму
        System.out.println("Answer is " + sum);
    }
}
