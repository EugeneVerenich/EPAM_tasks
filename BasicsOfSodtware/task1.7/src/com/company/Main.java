package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st angle : ");
        int a = in.nextInt();
        System.out.println("Enter 2nd angle : ");
        int b = in.nextInt();
        int c = 180 - (a+b);

        if(a <= 90 && b <= 90 && (a+b) != 180){
            System.out.println("Triangle exists !");
            if(a == 90 || b == 90 || c == 90){
                System.out.println("Triangle is rectangular !");
            }
        }else{
            System.out.println("Triangle does not exists !");
        }




    }
}
