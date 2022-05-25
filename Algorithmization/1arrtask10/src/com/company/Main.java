package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter dimension : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = random.nextInt();
        }

        for (int i = 1;i < n;i += 2){
            arr[i] = arr[i] % arr[i];
        }

        System.out.println("Array : ");
        for (int i = 0;i < n;i++){
            System.out.println(arr[i] + " ");
        }

    }
}
