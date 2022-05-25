package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter step h :");
        int h = in.nextInt();
        int y;

        for(int i = a;i <= b;i = i + h){
            if(i <= 2){
                y = -i;
                System.out.println("Answer is " + y);
            }else{
                y = i;
                System.out.println("Answer is " + y);
            }

        }

    }
}
