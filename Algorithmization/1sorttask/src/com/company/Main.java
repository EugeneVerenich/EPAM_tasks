/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размерность первого массива : ");
        int n = in.nextInt();
        System.out.println("Введите размерность второго массива : ");
        int n2 = in.nextInt();
        int k = random.nextInt(n);
        if (k == 0){k += 1;}
        System.out.println("Число k : " + k);

        //Создаем массивы и заполняем
        int[] first_array = new int[n+n2+1];
        int[] second_array = new int[n2];

        // Заполнение первого массива
        for (int i = 0; i < n; i++) {
            first_array[i] = random.nextInt(10);
            System.out.print(first_array[i] + " ");
        }
        System.out.println();

        // Заполнение второго массива
        for (int i = 0; i < n2; i++) {
            second_array[i] = random.nextInt(10);
            System.out.print(second_array[i] + " ");
        }
        System.out.println();

        //Объединяем их в один массив
        for (int i = k;i < n+n2;i++){
            try{
            int c = first_array[i];
            first_array[i] = second_array[i-k];
            first_array[i+1] = c;}catch(ArrayIndexOutOfBoundsException e){
                break;
            }
        }

        //Выводим
        for (int i = 0; i < n+n2; i++) {
            System.out.print(first_array[i]+" ");
        }

    }
}
