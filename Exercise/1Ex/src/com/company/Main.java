/*
Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
 Общие требования к заданию:
    • Система учитывает книги как в электронном, так и в бумажном варианте.
    • Существующие роли: пользователь, администратор.
    • Пользователь может просматривать книги в каталоге книг, осуществлять поиск
    книг в каталоге.
    • Администратор может модифицировать каталог.
    • *При добавлении описания книги в каталог оповещение о ней рассылается на
    e-mail всем пользователям
    • **При просмотре каталога желательно реализовать постраничный просмотр
    • ***Пользователь может предложить добавить книгу в библиотеку, переслав её
    администратору на e-mail.
    • Каталог книг хранится в текстовом файле.
    • Данные аутентификации пользователей хранятся в текстовом файле. Пароль
    не хранится в открытом виде
 */
package com.company;

import com.company.Actions.MenuActions;
import com.company.Library.Author;
import com.company.Library.Book;
import com.company.Library.Publisher;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MenuActions.choiceMenu();

    }
}
