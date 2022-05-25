package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.println(" Enter a : ");
        int a = in.nextInt();

        System.out.println(" Enter b : ");
        int b = in.nextInt();

        System.out.println(" Enter c : ");
        int c = in.nextInt();

        double z = ((b+Math.sqrt(Math.pow(b,2) + 4*a*c)) / a*2) - (Math.pow(a,3)*c) + Math.pow(b,(-2));
        System.out.println("Answer is " + z);

    }
}
