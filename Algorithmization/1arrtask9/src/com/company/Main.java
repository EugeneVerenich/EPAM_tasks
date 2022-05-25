package com.company;

import java.util.Scanner;
import java.util.Random;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the dimension of the array : ");
        int n = in.nextInt();
        int[] array = new int[n];
        // заполняем массив случайными числами
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(n);
        }
// выводим полученный массив
        for (int i = 0;i < n;i++){
           System.out.print(array[i]);
        }
System.out.println();
        // проверка ????

        }

    }
}
