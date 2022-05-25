/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/
package com.company;

import java.util.Scanner;

import static com.company.Customer.getCustomer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CustomersBase customers = new CustomersBase(1);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. добавить покупателя\n" +
                            "2. вывод покупателей в алфавитном порядке\n" +
                            "3. вывод покупателей с кредитной картой в интервале\n" +
                            ": "
            );
            int choice = in.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 3) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    customers.addCustomer(getCustomer());
                    break;
                case 2:
                    customers.sortByName();
                    customers.print();
                    break;
                case 3:
                    System.out.println("Введи диапазон кредитных карт\n");
                    System.out.println("От: ");
                    String from = in.next();
                    System.out.println("До: ");
                    String to = in.next();
                    customers.print_if_card_in(from, to);
            }
        }

    }
}
