/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int max = 0;
        // объявляем массив
        int[] array = {1,8,1,0,6,12,7};

        // находим максимальный
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        // находми второе по величине число
        int sec_max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > sec_max && array[i] < max)
                sec_max = array[i];
        }

        //выводим второе по величине число
        System.out.println("Второе по величине число : " + sec_max);

    }
}
