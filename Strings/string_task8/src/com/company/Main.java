/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку : ");
        String text = in.next();

        String[] array = text.split(" "); // разбиваем строку на элементы массива

        int max = 0; // переменная для хранения максимального элемента
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max){
                max = array[i].length();
            }
        }

        System.out.println("Самое длинное слово : " + max);

    }
}
