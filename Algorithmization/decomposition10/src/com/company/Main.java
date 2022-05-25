/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int N=19853;
        splitting(N);



    }

    static void splitting(int N){

        String tmp_N = String.valueOf(N); // преобразуем в строку
        System.out.println("Num= "+tmp_N);

        int l=tmp_N.length(); //размерность массива

        int a[] = new int[l];

        // Заполнение массива
        for(int i=0;i<l;i++)
        {
            a[i]=Integer.valueOf(tmp_N.substring(i, i+1)); // преобразуем в Integer элемент строки
        }

        // Выводим
        for(int k=0;k<l;k++)
        {
            System.out.println("Элемент массива номер "+k+ " = "+ a[k]);
        }
    }

}
