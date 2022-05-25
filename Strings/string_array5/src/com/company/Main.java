/**
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String string = "   Удалить      в     строке      все      лишние     пробелы    ";

        String str =  string.replaceAll("\\s+"," "); // убирает лишние пробелы между словами
        System.out.print(str.trim()); // убирает крайние пробелы

    }
}
