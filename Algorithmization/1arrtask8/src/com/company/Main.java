package com.company;

import java.util.Scanner;
import java.util.Random;

/**
 *  Дана последовательность целых чисел. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны
 * min(a1, a2, ..., an).
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the dimension of the array : ");
        int n = in.nextInt();
        int[] array = new int[n];
        int[] newarray = new int[n];
        for (int i = 0;i < n;i++){
            array[i] = random.nextInt(n);
        }

        int min = array[0];
        for (int i = 1;i < n;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        for (int i = 0;i < n;i++){
            if(array[i] != min){
                newarray[i] = array[i];
            }

        }

        for (int i = 0;i < n;i++){
            System.out.print(newarray[i]+" ");
        }

    }
}
