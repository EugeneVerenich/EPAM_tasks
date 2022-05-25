/**
 *  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */
package com.company;

public class Main {

    public static void main(String[] args) {


        int N = 123;
        Actions(N);


    }

    // разбиваем число и находим сумму цифр
    static int SumNum(int N) {
        String tmp_N = String.valueOf(N);
        int l = tmp_N.length();
        int[] a = new int[l];

        // заполняем массив цифрами числа и находим сумму
        int sum = 0;
        for(int k = 0; k < l; ++k) {
            a[k] = Integer.valueOf(tmp_N.substring(k, k + 1));
            sum += a[k];
        }
        return sum;
    }

    // вычисляем сколько действий надо произвести, чтобы получился нуль
    static void Actions(int N){
        int actions = 0;
        do {
            N -= SumNum(N);
            actions++;
        }while (N != 0);

        System.out.println("Количество действий : " + actions);
    }

}
