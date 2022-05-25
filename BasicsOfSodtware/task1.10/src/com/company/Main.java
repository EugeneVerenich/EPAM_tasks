package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A and B :");
        int A = in.nextInt();
        int B = in.nextInt();
        if(A <= 0 || B <= 0){
            System.out.println("Отверстия не существует!");
        }else {
        System.out.println("Enter x, y, z :");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();



            if (x <= 0 || y <= 0 || z <= 0) {
                System.out.println("Кирпича не существует!");
            } else {

                if ((x <= A && y <= B) || (y <= A && x <= B) || (x <= A && z <= B) || (z <= A && x <= B) || (y <= A && z <= B) || (z <= A && y <= B)) {
                    System.out.println("Кирпич проходит через отверстие");
                } else {
                    System.out.println("Кирпича не существует!");
                }
            }
        }

    }
}
