/**
 * В строке найти количество чисел.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        String str = "EFG 1654 d6g4d654s3g4s35d45 35135 sdfsf51a 215a1 2a35";

        int count = 0;
        boolean isPreviousDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){ // проверяем является ли элемент цифрой
                if (!isPreviousDigit){
                    // если предыдущий элемент не цифра, а нынешний ей является
                    // то считаем это началом числа
                    count++;
                    isPreviousDigit = true;
                }
            }else {
                isPreviousDigit = false; // элемент не является цифрой
            }
        }

        System.out.println("Количество чисел в строке : " + count);

    }
}
