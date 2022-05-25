/**
 * Проверить, является ли заданное слово палиндромом.
 */

package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String variable = "Довод";
        String str = variable.toLowerCase(Locale.ROOT); // переводит слово в нижний регистр

        StringBuffer rev = new StringBuffer(str).reverse(); // 'переворачивает' слово

        String strRev = rev.toString(); // записывает в строку

        // проверка
        if(str.equals(strRev)){
            System.out.println("Слово является палиндромом");
        }else {
            System.out.println("Слово не является палиндромом");
        }

    }
}
