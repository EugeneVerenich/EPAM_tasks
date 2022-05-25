/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Есть над чем задуматься: сделанные на базе интернет-аналитики выводы ассоциативно распределены по отраслям.";

        String new_str = str.replace('а','б'); // заменяет все символы 'а' на 'б'

        System.out.println(new_str);

    }
}
