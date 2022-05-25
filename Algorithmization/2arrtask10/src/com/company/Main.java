/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //Заполняем матрицу случайными числами и выводим
        System.out.println("Введите размерность матрицы : ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = random.nextInt();
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        //Находим и выводим положительные элементы главной диагонали
        System.out.println("Положительные элементы главной диагонали : ");
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                if (i == j && matrix[i][j] > 0){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
