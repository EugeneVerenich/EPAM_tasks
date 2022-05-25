/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //Заполняем матрицу случайными числами и выводим
        System.out.println("Введите количество строк : ");
        int line = in.nextInt();
        System.out.println("Введите количество столбцов : ");
        int column = in.nextInt();
        int[][] matrix = new int[line][column];
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Создаем массив для хранения суммы каждого столбца
        int[] sum = new int[column];

        //Считаем сумму в каждом столбце
        for (int j = 0;j < column;j++){
            int s = 0;
            for (int i = 0;i < line;i++){
                s += matrix[i][j];
            }
            sum[j] = s;
        }

        //Определяем какой столбец содержит максимальную сумму
        int max_sum = 0;
        int index_column = 0;
        for (int j = 0;j < column;j++){
             if (sum[j] > max_sum){
                 max_sum = sum[j];
                 index_column = j;
             }
        }

        //Выводим максимальную сумму и номер столбца
        System.out.println("Максимальная сумма : " + max_sum);
        System.out.println("Номер столбца с максимальной суммой : " + (index_column+1));

    }
}
