/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        search(5);

    }

    // Разбивание числа на цифры и проверка условия последовательности
    static void splitting(int N) {
        String tmp_N = String.valueOf(N);

        int l = tmp_N.length();
        int[] a = new int[l];

        int k; // Запись в массив цифр числа
        for(k = 0; k < l; ++k) {
            a[k] = Integer.valueOf(tmp_N.substring(k, k + 1));
        }

        // проверка совпадений
        int buf = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l; j++) {
                if (a[j] - a[i] == 1){
                    buf ++; // количество совпадений
                    break;
                }
                break;
            }
        }

        // вывод нужного числа
        if (buf == l-1){
            System.out.println("Число : " + N);
        }

    }

    // поиск всех натуральных чисел уд. условиям
    static void search(int n){

        int j = (int) (Math.pow(10,n-1)); // устанавливает начальную границу (если 4-знач. число то начало 1000)
        int k = (int) (Math.pow(10,n)); // устанавливает конечную границу (если 4-знач. число то конец 10000)
        for (int i = j; i < k; i++) {
            splitting(i);
        }

    }

}
