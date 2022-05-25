package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter dimension :");
        int n = in.nextInt();
        System.out.println("Enter Z :");
        double Z = in.nextDouble();
        double[] arr = new double[n];
        int amount = 0;

        for(int i = 0;i < n;i++){
            arr[i] = random.nextDouble();
            if(arr[i]>Z){
                arr[i] = Z;
                amount +=1;
            }
        }

        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Answer is " + amount);


    }
}
