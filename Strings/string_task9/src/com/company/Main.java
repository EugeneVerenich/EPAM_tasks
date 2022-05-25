/**
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next(); // вводим строку

        char[] array = str.toCharArray();// каждый элемент записываем в массив

        int big_count = 0;// переменная для больших букв
        int small_count = 0;// переменная для маленьких букв

        for (char c : array) {
            // если буквы из англ. алфавита
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                System.out.print(c+" ");
                if (c <= 'Z') {
                    big_count++;// подсчет больших букв
                } else {
                    small_count++;// подсчет маленьких букв
                }

            }
        }

        System.out.println();
        System.out.println("Количество больших букв : "+big_count);
        System.out.println("Количество маленьких букв : "+small_count);

    }
}
