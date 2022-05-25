package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int b1;

        while(a > 0){
            int c = a % 10;
            b1 = b;
            while (b1 > 0){
                int d = b1 % 10;
                if(c == d){
                    System.out.println(c);
                    break;
                }
                    b1 = b1 / 10;

            }
            a = a / 10;

        }

    }
}
