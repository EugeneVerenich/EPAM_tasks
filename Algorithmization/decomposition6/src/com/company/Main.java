/**
 *  Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = 25;
        int c = 35;

        simple(a,b,c);

    }

    static void simple(int n1, int n2, int n3) {
        int nod = 1;

        for(int i = 1; i <= n1 && i <= n2 && i<= n3; ++i) {
            if (n1 % i == 0 && n2 % i == 0 && n3 % i == 0) {
                nod = i;
            }
        }

        if (nod == 1){
            System.out.println("Числа являются взаимнопростыми!!!");
        }else {System.out.println("Числа НЕ являются взаимнопростыми!!!");}
    }

}
