/*
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
package com.company;

import java.util.Scanner;

public class AirplaneBase {

    private Airline[] airlines;
    private int capacity;
    private int size;

    public AirplaneBase(int capacity){
        size = 0;
        this.capacity = capacity;
        airlines = new Airline[capacity];
    }

    // добавление airline
    public void addAirline(Airline airline){
        if (size < capacity){
            airlines[size] = airline;
            size++;
        }else {
            Airline[] buffer = new Airline[2*capacity];
            for (int i = 0; i < size; i++) {
                buffer[i] = airlines[i];
            }
            airlines = buffer;
            capacity = capacity*2;
            airlines[size] = airline;
            size++;
        }
    }

    // показать всю базу
    public void showBase(){
        for (int i = 0; i < size; i++) {
            airlines[i].showInfo();
        }
    }

    // вывод списка по заданному пункту назначения
    public void getDestinationList(){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите пункт назначения : ");
        String my_destination = in.nextLine();

        for (int i = 0; i < size; i++) {
            if (airlines[i].getDestination().equals(my_destination)){
                airlines[i].showInfo();
            }
        }

    }

    // вывод списка по заданному дню недели
    public void getWeekdayList(){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели : ");
        String my_day = in.next();

        for (int i = 0; i < size; i++) {
            if (airlines[i].getWeekday().equals(my_day)){
                airlines[i].showInfo();
            }
        }

    }

    // список по дню и времени вылета
    public void getWeekdayListWithTime(){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите день недели : ");
        String my_day = in.next();

        System.out.print("Введите время вылета : ");
        String my_time = in.next();

        for (int i = 0; i < size; i++) {
            if (airlines[i].getWeekday().equals(my_day) && airlines[i].getDeparture_time().compareTo(my_time) > 0){
                airlines[i].showInfo();
            }
        }
    }

}
