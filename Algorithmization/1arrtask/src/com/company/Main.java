package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter dimension : ");
        int n = in.nextInt();
        int plus = 0;
        int minus = 0;
        int zero = 0;
        double[] arr = new double[n];
        for (int i = 0;i < n;i++){
            arr[i] = random.nextInt();
            if (arr[i]>0){
                 plus += 1;
            }else{
                if (arr[i] < 0){
                    minus += 1;
                }else {
                    if(arr[i] == 0)
                        zero += 1;
                }
            }
        }
        for (int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Количество положительных чисел : "+ plus);
        System.out.println("Количество отрицательных чисел : "+ minus);
        System.out.println("Количество нулевых элементов : "+ zero);


    }
}
