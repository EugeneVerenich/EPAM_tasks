/**
 *  Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */
package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int K = 21; // Сумма цифр в числе равна 21
        int N = 1000; // Числа не больше 1000


        make_array(K, N);

    }

    // Разбивает число на цифры и находит их сумму
    static int num_sum(int n) {
        String tmp_n = String.valueOf(n); // преобразование в строку
        int l = tmp_n.length();
        int[] a = new int[l];

        int k;
        for(k = 0; k < l; ++k) {
            a[k] = Integer.valueOf(tmp_n.substring(k, k + 1)); // запись в массив
        }

        int sum = 0;
        for(k = 0; k < l; ++k) {
            sum += a[k]; // подсчет суммы
        }

        return sum;

    }

    // Заполняет массив случайными числами уд. условиям
    static void make_array(int K, int N){
        int[] array = new int[5];
        Random random = new Random();

        // заполняем массив случайными числами уд. условиям
        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = random.nextInt(N);
            }while (num_sum(array[i]) != K);
        }

        //Вывод массива
        System.out.println("Массив : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
