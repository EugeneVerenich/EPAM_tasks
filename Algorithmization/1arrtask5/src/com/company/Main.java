package com.company;

import java.util.Scanner;
import java.util.Random;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the dimension of the array : ");
        int n = in.nextInt();
        int[] array = new int[n];

        // заполняем массив случайными целыми числами и выводим для просмотра
        for(int i = 0;i < n;i++){
            array[i] = random.nextInt(n);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // выводим нужные числа
        System.out.println("Answer is ");
        for (int i = 0;i < n;i++){
            if(array[i] > i){
                System.out.print(array[i] + " ");
            }
        }


    }
}
