/**
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.";

        int count = 0;// переменная для подсчета

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'а'){
                //если проверяемый символ это 'а'
                //то count + 1
                count++;
            }
        }

        System.out.println("Буква 'а' встречается "+count+" раз!!!");

    }
}
