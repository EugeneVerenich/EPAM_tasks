/**
 *  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы (четное число) : ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        //Заполняем матрицу нулями
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                matrix[i][j] = 0;
            }
        }

        //Заполняем матрицу в правильном порядке
        for (int i = 0;i < n;i++){
            for (int j = i;j < n-i;j++){
                //как ??????
            }
        }

    }
}
