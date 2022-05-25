/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //Формируем матрицу
        System.out.println("Введите количество строк : ");
        int line = in.nextInt();
        System.out.println("Введите количество столбцов : ");
        int column = in.nextInt();

        //Заполняем матрицу случайными числами(для удобства до 10) и выводим для проверки
        int[][] matrix = new int[line][column];
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Ищем максимальный элемент матрицы
        int max = 0;
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                if (matrix[i][j] > max)
                max = matrix[i][j];
            }
        }

        //Меняем все нечетные элементы на максимальный и выводим матрицу
        System.out.println("Матрица : ");
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                if (matrix[i][j]%2 != 0) {
                    matrix[i][j] = max;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
