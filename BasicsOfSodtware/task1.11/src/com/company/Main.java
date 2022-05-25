package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x :");
        int x = in.nextInt();
        double F;
        if(x <= 3){
             F = Math.pow(x, 2) - 3*x + 9;

        }else{
             F = 1/(Math.pow(x, 3) + 6);
        }
        System.out.println("Answer is " + F);
    }
}
