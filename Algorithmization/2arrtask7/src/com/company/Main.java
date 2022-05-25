/**
 * Сформировать квадратную матрицу порядка N по правилу
 * и подсчитать количество положительных элементов в ней.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы : ");
        int n = in.nextInt();
        int amount = 0; // Переменная для хранения количества положительных чисел

        double[][] matrix = new double[n][n];
        //Заоплняем матрицу и выводим для проверки(вместе с количеством положительных элементов)
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = Math.sin((Math.pow(i,2)-Math.pow(j,2))/n);
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > 0){
                    amount += 1;
                }
            }
            System.out.println();
        }

        //Выводим количество положительных элементов
        System.out.println("Количество положительных элементов : " + amount);

    }
}
