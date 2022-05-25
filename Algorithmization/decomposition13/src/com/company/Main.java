/**
 *  Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        twins(10);

    }

    static void twins(int n){

        int[] array = new int[2*n - n + 1];

        // заполняем массив числами из отрезки
        for (int i = 0; i < array.length ; i++) {
            array[i] = n + i;
        }

        // выводим числа близнецы
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] - array[i] == 2){
                    System.out.println("Числа-'близнецы' "+array[i]+" и "+array[j]);
                    break;
                }
            }
        }

    }

}
