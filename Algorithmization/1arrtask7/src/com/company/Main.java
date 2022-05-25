package com.company;

import java.util.Scanner;
import java.util.Random;

/**
 * Даны действительные числа. Найти
 * max(a1 + a2n,a2 + a2n-1, ... ,an + an+1)
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the dimension of the array : ");
        int n = in.nextInt();
        double[] array = new double[n];

        // заполняем массив случайными числами
        System.out.println("Array : ");
        for(int i = 0;i < n;i++){
                array[i] = random.nextDouble();
                System.out.println(array[i]);
        }

       // вывод максимального элемента ?????


    }
}
