/**
 *  Сортировка обменами.Требуется переставить числа в
 * порядке возрастания.Составить алгоритм сортировки, подсчитывая при этом количества перестановок
 */

package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

          int[] array = new int[6];

        Random random = new Random();
        //Заполняем массив и выводим
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i]+" ");
        }System.out.println();


        //Сортируем
        array[5] = array[0];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j <= 5; j++) {
                if (array[i] > array[j]){
                    int c = array[j];
                    array[j] = array[i];
                    array[i] = c;
                    sum += 1;
                    break;
                }
            }
        }

        System.out.println("Количесвто перестановок : " + sum);
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
