/**
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
 */
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String text = "Дан    текст.  Найдите     наибольшее       количество   подряд идущих пробелов  в   нем";
        ArrayList<Integer> array = new ArrayList<>(); // массив для хранения количества пробелов

        int cout = 0; // счетчик подряд идущих пробелов

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                // если это пробел суммируем его
                // чтобы найти количество подряд идущих
                cout++;
            }else {
                // если это не пробел записываем cout
                // в массив и обнуляем его
                array.add(cout);
                cout = 0;
            }
        }

        // находим максимальное число
        int max = 0;
        for (int num: array) {
            if (num > max)
            max = num;
        }

        System.out.println("Максимальное количество подряд идущих пробелов : " + max);

    }
}
