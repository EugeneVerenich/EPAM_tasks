/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел
 */
package com.company;

public class Main {

    public static void main(String[] args) {


        int A = 15;
        int B = 25;

        // Вывод результатов
        System.out.println("НОД : "+NOD(A, B));
        System.out.println("НОК : "+NOK(A, B));



    }
    // метод считающий НОД
    static int NOD(int n1, int n2) {
        int nod = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) { nod = i; }
        } return nod;
    }
    // метод считающий НОК
    static int NOK(int n1, int n2){
        int nok = (n1*n2)/NOD(n1, n2);
        return nok;
    }
}
