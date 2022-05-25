/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();
        char[] array = str.toCharArray();


        StringBuilder new_str = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' '){
                continue;
            }
            new_str.append(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    break;
                }
               // new_str.append(array[i]);
                break;
            }
        }

        System.out.print(new_str);

    }
}
