/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        Arm_num(10000); // Поиск чисел от одного до 1000


    }

    // проверка числа
	static void Armstrong(int N){

        String tmp_N = String.valueOf(N); // преобразуем в строку

        int l=tmp_N.length(); //размерность массива

        int a[] = new int[l];

        // Заполнение массива и вывод суммы
        int sum = 0;
        for(int i=0;i<l;i++)
        {
            a[i]=Integer.valueOf(tmp_N.substring(i, i+1)); // преобразуем в Integer элемент строки
            sum += a[i];
        }

        if (Math.pow(sum, a.length) == N){
            System.out.println("Число Армстронга : " + N);
        }

	}

    // поиск нужных чисел
    static void Arm_num(int k){
        for (int i = 1; i <= k; i++) {
            Armstrong(i);
        }
    }

}
