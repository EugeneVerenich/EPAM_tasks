package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1, x2, x3 :");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        System.out.println("Enter y1, y2, y3 :");
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        int y3 = in.nextInt();

        if((x2 - x1)/(x3 - x1) == (y2 - y1)/(y3 - y1)){
            System.out.println("Points are collinear");
        }else{
            System.out.println("Points are not collinear");
        }
    }
}
