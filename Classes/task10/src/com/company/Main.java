/*
 Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        AirplaneBase base = new AirplaneBase(1);

        while(true){
            System.out.print("Выберете пункт меню:\n" +
                    "0. выйти\n" +
                    "1. добавить Airline\n" +
                    "2. список рейсов для заданного пункта назначения\n" +
                    "3. список рейсов для заданного дня недели\n" +
                    "4. список рейсов для заданного дня недели, время вылета для которых больше заданного.\n" +
                    ": ");
            int choice = in.nextInt();
            if (choice == 0){
                break;
            }
            if (choice < 1 || choice > 4){
                System.out.print("Введите пункт из меню!!!");
                continue;
            }
            switch (choice) {
                case 1 -> base.addAirline(Airline.getAirline());
                case 2 -> base.getDestinationList();
                case 3 -> base.getWeekdayList();
                case 4 -> base.getWeekdayListWithTime();
            }
        }

    }
}
