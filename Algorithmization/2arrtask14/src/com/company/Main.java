/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
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

        //Заполняем матрицу
        /**int[][] matrix = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt(2);
                if (matrix[i][j] == 1) {
                    for (int f = i + 1; f < line; f++) {
                        matrix[f][j] = 0;
                    }
                    break;
                }
            }
        }*/

        //Выводим матрицу
        System.out.println("Матрица : ");
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
