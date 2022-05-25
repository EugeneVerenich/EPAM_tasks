/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        // добавляем заголовок
        Word word = new Word("HELLO!!!");
        Text text = new Text(word);

        // запись слов
        Word word1 = new Word("Hi");
        Word word2 = new Word("My");
        Word word3 = new Word("name");
        Word word4 = new Word("is");
        Word word5 = new Word("Eugene");

        // составляем предложения
        Phrase phrase = new Phrase();
        phrase.addValue(word1);
        Phrase phrase1 = new Phrase();
        phrase1.addValue(word2);
        phrase1.addValue(word3);
        phrase1.addValue(word4);
        phrase1.addValue(word5);

        // формируем текст
        text.addBody(phrase);
        text.addBody(phrase1);

        // выводим текст
        System.out.println("Head : " + text.getHeader());
        System.out.println("Body : " + text.getBody());

    }
}
