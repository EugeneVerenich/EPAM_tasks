/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
package com.company;

public class Main {

    static int first_nod(int n1, int n2){
        int fnod = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                fnod = i;
            }
        }
        return fnod;
    }

    static int second_nod(int n1, int n2){
        int snod = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                snod = i;
            }
        }
        return snod;
    }

    static int NOD(int n1, int n2){
        int nod = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    public static void main(String[] args) {


        int A = 10;
        int B = 46;
        int C = 12;
        int D = 20;

        //НОД первых двух чисел
        int first_nod = first_nod(A, B);

        // НОД 3 и 4 чисел
        int second_nod = second_nod(C, D);

        // Общий НОД
        System.out.println(NOD(first_nod, second_nod));

    }
}
