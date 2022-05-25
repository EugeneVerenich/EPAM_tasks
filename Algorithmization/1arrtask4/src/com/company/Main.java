package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = in.nextInt();

        double[] arr = new double[n];
        for (int i = 0;i<n;i++){
            arr[i] = random.nextDouble();
        }
//выводим массив
        System.out.println("Array : ");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i] + "  ");
        }
        //Отсортированный массив
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(arr[i] < arr[j]){
                    double c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;

                }
            }
        }
        System.out.println();
        System.out.println("Min : " + arr[0]);
        System.out.println("Max : " + arr[n-1]);

    }
}
