/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int N = 1654138;
        int N2 = 21353545;
        System.out.println("Первое число "+N);
        System.out.println("Второе число "+N2);
        inequality(N,N2);

    }

    //выясняем количесвто цифр
    static int splitting(int N){

        String tmp_N = String.valueOf(N); // преобразуем в строку

        int l = tmp_N.length(); // количество цифр в числе
        return l;
    }

    // сравнение чисел
    static void inequality(int N, int N2){
        if (splitting(N) < splitting(N2)){
            System.out.println("Цифр больше в числе " + N2);
        }else {
            if (splitting(N) == splitting(N2)){System.out.println("Цифр в числах равное количество!!!");}
            else {
            System.out.println("Цифр больше в числе " + N);
            }
        }
    }

}
