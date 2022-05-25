/*
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BooksBase books = new BooksBase(1);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить книгу\n" +
                            "2. вывод книг, выпущенных заданным издательством\n" +
                            "3. вывод книг, выпущенных после заданного года\n" +
                            "4. вывод книг заданного автора\n"+
                            ": "
            );
            int choice = in.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1 -> books.addBook(Book.getBook());
                case 2 -> books.getClientPublishing();
                case 3 -> books.afterYear();
                case 4 -> books.getAuthorBook();
            }
        }


    }
}
