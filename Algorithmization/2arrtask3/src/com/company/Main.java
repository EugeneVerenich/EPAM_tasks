package com.company;

import java.util.Scanner;
import java.util.Random;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность матрицы : ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        //Заполняем матрицу случайными числами и выводим для проверки
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print( matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Введите k-ю строку : ");
        int k = in.nextInt();
        System.out.println("Введите p-й столбец : ");
        int p = in.nextInt();

        //Выводим k-ю строку
        System.out.println("k-ая строка : ");
       for (int j = 0;j < n;j++){
           System.out.print( matrix[k][j] + " ");
       }
       System.out.println();

        //Выводим p-й столбец
        System.out.println("p-й столбец : ");
        for (int i = 0;i < n;i++){
            System.out.println( matrix[i][p] + " ");
        }
    }
}
