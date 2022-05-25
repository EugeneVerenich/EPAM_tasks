package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){

            sum = sum + i;
        }
        System.out.println("Answer is " + sum);

    }
}
