/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] matrix = new int[10][20];

        //Заполняем матрицу случайными числами от 0 до 15 и выводим
        for (int i = 0;i < 10;i++){
            for (int j = 0;j < 20;j++){
                matrix[i][j] = random.nextInt(15);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Выводим номера строк, в которых число 5 встречается три и более раз.
        System.out.println("Номера строк, в которых число 5 встречается три и более раз : ");
        for (int i = 0;i < 10;i++){
            int amount = 0; // переменная для хранения количества 5 в строке
            for (int j = 0;j < 20;j++){
                if (matrix[i][j] == 5){
                    amount += 1;
                }
            }
            if (amount >= 3){
                System.out.print((i+1) + " ");
            }
        }

    }
}
