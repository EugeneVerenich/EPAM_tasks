/**
 * Сортировка вставками.Требуется переставить числа в порядке
 * возрастания
 */
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {10,5,8,9,7,3,0,1,4,2,6};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));


    }
}
