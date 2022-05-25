/**
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String main_word = "информатика";

        char[] array = new char[4]; // массив для записи символов

        main_word.getChars(7,8,array,0);// копируем 'т'
        main_word.getChars(3,4,array,1);// копируем 'о'
        main_word.getChars(4,5,array,2);// копируем 'р'
        main_word.getChars(7,8,array,3);// копируем 'т'

        StringBuilder new_word = new StringBuilder();// создаем новое слово

        for (int i = 0; i < array.length; i++) {
            new_word.append(array[i]);// добавляем элементы в новое слово
        }

        System.out.println(new_word);// выводим



    }
}
