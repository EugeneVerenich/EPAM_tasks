/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //Заполняем матрицу и выводим
        System.out.println("Введите количество строк : ");
        int line = in.nextInt();
        System.out.println("Введите количество столбцов : ");
        int column = in.nextInt();
        int[][] matrix = new int[line][column];
        System.out.println("Матрица : ");
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Сортируем элементы внутри строк по возрастанию
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                for (int k = 0;k < column;k++){
                    if (matrix[i][j] < matrix[i][k]){
                            int c = matrix[i][j];
                            matrix[i][j] = matrix[i][k];
                            matrix[i][k] = c;
                    }
                }
            }
        }

        //Выводим матрицу
        System.out.println("Матрица (элементы в строке отсортированны по возрастанию) : ");
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Сортируем по убыванию
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                for (int k = 0;k < column;k++){
                    if (matrix[i][j] > matrix[i][k]){
                        int c = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = c;
                    }
                }
            }
        }

        //Выводим матрицу
        System.out.println("Матрица (элементы в строке отсортированны по убыванию) : ");
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
