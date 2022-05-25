/**
 * Сортировка выбором.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию
 */

package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        // Заполняем массив и выводим
        for (int i = 0; i < 5; i++) {
           array[i] = random.nextInt(10);
           System.out.print(array[i]+" ");
        }
        System.out.println();

        //Сортируем
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (array[j] > array[i]){
                    int c = array[i];
                    array[i] = array[j];
                    array[j] = c;
                }
            }
        }

        //Выводим отсортированный массив
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
