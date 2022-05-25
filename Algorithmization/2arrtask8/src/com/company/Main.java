/**
 * В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        //Вводим данные для матрицы
        System.out.println("Введите количество строк : ");
        int line = in.nextInt();
        System.out.println("Введите количество столбцов : ");
        int column = in.nextInt();
        int[][] matrix = new int[line][column];

        //Заполняем матрицу случайными числами и выводим
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Меняем столбцы местами
        System.out.println("Введите столбец 1(отсчет начинается с 1) : ");
        int column1 = in.nextInt() - 1;
        System.out.println("Введите столбец 2 : ");
        int column2 = in.nextInt() - 1;
        for (int i = 0;i < line;i++){
            int c = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = c;
        }

        //Выводим измененную матрицу
        for (int i = 0;i < line;i++){
            for (int j = 0;j < column;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
