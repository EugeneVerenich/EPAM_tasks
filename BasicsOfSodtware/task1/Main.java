package com.company;

import java.util.Scanner;

/**
 *  Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Main {

    public static void main(String[] args) {

        double z;

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter a : ");
        double a = in.nextInt();

        System.out.println(" Enter b : ");
        double b = in.nextInt();

        System.out.println(" Enter c : ");
        double c = in.nextInt();

         z = ((a - 3) * b / 2) + c;
         System.out.println("Answer is " + z);
    }
}
