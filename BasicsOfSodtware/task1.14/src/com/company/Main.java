package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double sum = 0;


        for(int i = 1;i <= 100;i++){
             sum = sum + Math.pow(i,2);
        }
        System.out.println("Answer is " + sum);

    }
}
