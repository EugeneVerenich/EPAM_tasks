package com.company;

import java.util.Random;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matrix = new int[4][4];

        //Заполняем матрицу случайными числами и выводим для проверки
        System.out.println("Матрица : ");
        for (int i = 0;i < 4;i++){
            for (int j = 0;j < 4;j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Элементы по диагонали : ");
        //Выводим элементы, стоящие на диагонали
        for (int i = 0;i < 4;i++){
            for (int j = 0;j < 4;j++){
                if(i == j){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

    }
}
