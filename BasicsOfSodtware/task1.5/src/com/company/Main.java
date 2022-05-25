package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time in seconds : ");
        int T = in.nextInt();
        double h = T / 3600;
        int ah = (int)h;
        double m = (T/60) - (ah*60);
        int am = (int)m;
        int as = T - ((ah*60 + am)*60);
        System.out.println("Answer is "+ ah + "ч " + am +"мин " + as + "с ");

    }
}
