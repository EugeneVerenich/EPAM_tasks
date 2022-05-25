package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter m and n : ");
        int m = in.nextInt();
        int n = in.nextInt();

        for(int i = m;i <= n;i++){
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    System.out.println("[" + i + "]" + " = " + j);
                }
            }
        }



    }
}
