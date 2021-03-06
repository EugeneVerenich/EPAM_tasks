/**
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
 * алфавиту.
 */
package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        String text = "Разнообразный и богатый опыт начало повседневной работы по формированию позиции в значительной степени обуславливает создание новых предложений. Идейные соображения высшего порядка, а также начало повседневной работы по формированию позиции способствует подготовки и реализации модели развития. Равным образом укрепление и развитие структуры играет важную роль в формировании форм развития. Таким образом укрепление и развитие структуры в значительной степени обуславливает создание позиций, занимаемых участниками в отношении поставленных задач. Разнообразный и богатый опыт укрепление и развитие структуры требуют от нас анализа новых предложений. Повседневная практика показывает, что постоянный количественный рост и сфера нашей активности позволяет выполнять важные задания по разработке системы обучения кадров, соответствует насущным потребностям." + "\u2029"
                +"Проверочное предложение. С другой стороны новая модель организационной деятельности представляет собой интересный эксперимент проверки существенных финансовых и административных условий. Задача организации, в особенности же постоянное информационно-пропагандистское обеспечение нашей деятельности способствует подготовки и реализации модели развития. Таким образом реализация намеченных плановых заданий влечет за собой процесс внедрения и модернизации дальнейших направлений развития. Повседневная практика показывает, что рамки и место обучения кадров в значительной степени обуславливает создание направлений прогрессивного развития. Идейные соображения высшего порядка, а также новая модель организационной деятельности позволяет выполнять важные задания по разработке существенных финансовых и административных условий. Равным образом реализация намеченных плановых заданий играет важную роль в формировании позиций, занимаемых участниками в отношении поставленных задач.";


        //paragraph_sort(text);
        sentence_sort(text);
       // System.out.println(text);

    }

    static void paragraph_sort(String text){

        String[] paragraph_array = text.split("\u2029"); // разбиваем текст на абзацы

        ArrayList<String[]> sentences = new ArrayList<>(); // список для хранения предложений

        // разбиваем абзацы на предложения
        for (String paragraph : paragraph_array) {
            sentences.add(paragraph.split("[.!?]"));
        }

        int[] array = new int[paragraph_array.length]; // массив для количества предложений

        // заполнение массива
        for (int i = 0; i < paragraph_array.length; i++) {
            array[i] = sentences.get(i).length;
        }

        // сортируем по количеству предложений
        for (int i = 0;i < paragraph_array.length;i++) {
            for (int j = i+1; j < paragraph_array.length; j++) {
                if (array[i] < array[j]){
                    String c = paragraph_array[i];
                    paragraph_array[i] = paragraph_array[j];
                    paragraph_array[j] = c;
                }
            }
        }

        for (int i = 0; i < paragraph_array.length; i++) {
            System.out.println(paragraph_array[i]);
        }

    }

    static void sentence_sort(String text){

        String[] sentences = text.split("[.?!]");// разбиваем текст на предложения

        ArrayList<String[]> words = new ArrayList<>();

        for (int i = 0; i < sentences.length; i++) {
            words.add(sentences[i].split("[ ,;]")); // разбиваем предложения на слова
        }

        // сортировка
        for (int i = 0; i < sentences.length; i++){
            Arrays.sort(words.get(i));
        }

        for (int i = 0; i < sentences.length; i++) {
            for (String str : words.get(i)) {
                System.out.print(str + " ");
            }
            System.out.println();
        }


    }

}
