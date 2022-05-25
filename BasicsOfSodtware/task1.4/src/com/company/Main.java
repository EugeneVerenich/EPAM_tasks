package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'a' in right format( nnn.ddd ) ");


        double a = scan.nextDouble();


        double b = ((int)a) - a;
        System.out.println(b);
        int c = (int)a;
        System.out.println(c);
        double d = Math.round((Math.abs(b)*1000000) + c);

         System.out.println("Answer is "+ d);

    }
}
