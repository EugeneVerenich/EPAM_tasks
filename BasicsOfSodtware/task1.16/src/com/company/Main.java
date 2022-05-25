package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter interval(a, b) :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter e :");
        double e = in.nextDouble();
        double sum = 0;


        for(int i = a;i <= b;i++){
            double an = (1/Math.pow(2, i)) + (1/Math.pow(3, i));
            if(an >= e){
                sum = sum + an;
            }
        }
        System.out.println("Answer is " + sum);

    }
}
