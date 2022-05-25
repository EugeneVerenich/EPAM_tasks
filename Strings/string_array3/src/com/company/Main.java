/**
 * В строке найти количество цифр.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "sd5g4dgsd4hf5hd3gh4dh5rhs5df4h2hg135 ";
        System.out.println(str);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { // проверяем является ли символ цифрой
                count++; // считаем количество цифр
            }
        }

        System.out.println("Количество цифр в строке : " + count);

    }
}
