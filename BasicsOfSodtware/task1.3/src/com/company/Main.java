package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x and y : ");
        double x =  in.nextInt();
        double y = in.nextInt();
        double f = (Math.sin(x)+Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y) ;
        System.out.println("Answer is " + f);




    }
}
