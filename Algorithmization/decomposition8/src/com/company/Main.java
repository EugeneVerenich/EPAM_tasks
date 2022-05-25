/**
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        //массив
        int[] D = {1,5,2,1,5,3,156,18,9,2,8,0,5,2,5};

        //Выводим суммы
        Sum(1,3,D);
        Sum(3,5,D);
        Sum(4,6,D);

    }
    //Считает сумму заданных элементов массива
    static void Sum(int k, int m, int[] D){
        int sum = 0;
        for (int i = k; i < m+1; i++) {
            sum += D[i];
        }
        System.out.println("Сумма элементов от "+k+" до "+m+" : "+sum);
        System.out.println();
    }
}
