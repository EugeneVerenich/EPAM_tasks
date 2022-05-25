/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы (четное число) : ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        //Заполнение матрицы в правильном порядке
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                if(i%2 == 0){
                    matrix[i][j] = j+1;
                }else {
                    matrix[i][j] = Math.abs(j - n);
                }
            }
        }

        //Вывод матрицы
        System.out.println("Матрица : ");
        for (int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }
}
