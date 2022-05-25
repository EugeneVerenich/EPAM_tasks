/**
 * Даны две последовательности. Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность первого массива : ");
        int n = in.nextInt();



        //Создаем массивы и заполняем
        int[] first_array = new int[2*n];
        int[] second_array = new int[n];

        // Заполнение первого массива
        for (int i = 0; i < n; i++) {
            first_array[i] = random.nextInt(10);
        }
        System.out.println();

        //Сортируем первый массив
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (first_array[i] < first_array[j]) {
                    int c = first_array[i];
                    first_array[i] = first_array[j];
                    first_array[j] = c;
                }
            }
        }
        //Вывод массива
        for (int i = 0; i < n; i++) {
            System.out.print(first_array[i] + " ");
        }
        System.out.println();

        // Заполнение второго массива
        for (int i = 0; i < n; i++) {
            second_array[i] = random.nextInt(10);
        }
        System.out.println();

        //Сортируем второй массив
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (second_array[i] < second_array[j]) {
                    int c = second_array[i];
                    second_array[i] = second_array[j];
                    second_array[j] = c;
                }
            }
        }
        //Вывод массива
        for (int i = 0; i < n; i++) {
            System.out.print(second_array[i] + " ");
        }
        System.out.println();

        //Объединяем их в один массив
        for (int i = 0; i < 2*n; i++) {
                    first_array[i] = first_array[i];
                if (i >= n){first_array[i] = second_array[i - n];}

        }

        //Выводим и сортируем матрицу
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (first_array[i] < first_array[j]) {
                    int c = first_array[i];
                    first_array[i] = first_array[j];
                    first_array[j] = c;
                }
            }
        }

        for (int i = 0; i < 2*n; i++) {
            System.out.print(first_array[i]+" ");
        }

    }
}






