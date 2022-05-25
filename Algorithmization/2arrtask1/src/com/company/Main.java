package com.company;

import java.util.Scanner;
import java.util.Random;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int[][] matrix = new int[3][4];
        //Заполняем матрицу случайными целыми числами
        for (int i = 0;i<3;i++){
            for (int j = 0;j < 4;j++){
                matrix[i][j] = random.nextInt(10);
            }
        }
         //Вывод матрицы для проверки
        for (int i = 0;i<3;i++){
            for (int j = 0;j < 4;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

       //Вывод нечетных столбцов, у которых первый элемент больше последнего.
            for (int j = 0;j < 4;j+=2){
                if(matrix[0][j] < matrix[2][j]){
                    System.out.println("Столбец " + (j+1) + "-ый : ");
                    for (int i = 0;i < 3;i++){
                        System.out.println(matrix[i][j]);
                    }
                }
            }



    }
}
