package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter dimension :");
        int N = in.nextInt();
        System.out.println("Enter K");
        int K = in.nextInt();
        int[] arr = new int[N];
        int sum = 0;

        for (int i = 1;i < N;i++){
            arr[i] = i;
            if(arr[i]%K == 0){
                sum += arr[i];
            }
        }
        System.out.println("Answer is " + sum);
    }
}
