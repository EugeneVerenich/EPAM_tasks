package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a, b, c, d :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int m,m1,m2;

        if(a < b){
             m = a;
        }else{
            m = b;
        }

        if(c < d){
             m1 = c;
        }else {
             m1 = d;
        }

        if(m < m1){
            m2 = m1;
        }else{
            m2 = m;
        }

        System.out.println("Max = " + m2);
    }
}
