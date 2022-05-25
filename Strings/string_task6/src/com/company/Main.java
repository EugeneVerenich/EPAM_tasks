/**
 *  Из заданной строки получить новую, повторив каждый символ дважды
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Из заданной строки получить новую, повторив каждый символ дважды";

        StringBuilder new_str = new StringBuilder();// 'строим' новую строку

        for (int i = 0; i < str.length(); i++) {
            //повторяем каждый элемент дважды
            new_str.append(str.charAt(i));
            new_str.append(str.charAt(i));
        }

        // вывод новой строки
        System.out.println(new_str);

    }
}
