/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void TrainNumSort(Train[] trains){

        System.out.println("Список поездов, отсортированных по номеру : ");

        // алгоритм сортировки
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length; j++) {
                if (trains[i].getTrain_num() <= trains[j].getTrain_num()){
                    Train train_buf = trains[i];
                    trains[i] = trains[j];
                    trains[j] = train_buf;
                }
            }
        }

        for (Train train : trains) {
            train.showInfo(); // вывод информации для каждого поезда
        }
    }// сортировка по номеру

    public static void getTrain(Train[] trains){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер поезда : ");
        try {
            int num = in.nextInt(); // ввод номера поезда

            boolean NoTrains = true; // "правда" пока не нашли поезд

            for (Train train : trains) {
                if (train.getTrain_num() == num) {
                    // поиск поезда
                    train.showInfo();
                    NoTrains = false; // "ложь" если нашли поезд
                }
            }

            if (NoTrains)// если не нащли поезд
                System.out.println("Нет поезда с таким номером!!!");
        }catch (InputMismatchException er){
            // исключение неправильного ввода
            System.out.println("Неправильный ввод(только цифры)!!!");
            getTrain(trains); // запуск функции заново
        }

    }// поиск поезда по номеру

    public static void TrainStationSort(Train[] trains) throws ParseException {

        System.out.println("Список поездов, отсоритрованных по пунктам назанчения(по первой букве)");

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");// формат для записи времени отправления
        Date date1;
        Date date2;

        // алгоритм сортировки
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length; j++) {
                // сортировка по первой букве слова
                if (trains[i].getStation_name().charAt(0) <= trains[j].getStation_name().charAt(0)){
                    Train train_buf = trains[i];
                    trains[i] = trains[j];
                    trains[j] = train_buf;
                }
                // случай если пункты назначения совпадают
                if (trains[i].getStation_name().equals(trains[j].getStation_name())){
                    date1 = format.parse(trains[i].getTime());// время отправления первого поезда
                    date2 = format.parse(trains[j].getTime());// время отправления второго поезда
                    // сортировка по времени отправления
                    if (date1.compareTo(date2) <= 0){
                        Train train_buf = trains[i];
                        trains[i] = trains[j];
                        trains[j] = train_buf;
                    }

                }
            }
        }

        // вывод информации
        for (Train train : trains) {
            train.showInfo();
        }

    }// сортировка по пункту назначения

    public static void Start(Train[] trains) throws ParseException {

        Scanner in = new Scanner(System.in);

        System.out.print("""
                Выберите функцию(цифру) :\s
                1 - вывод списка поездов по их номеру;
                2 - поиск поезда по номеру;
                3 - вывод списка поездов по их пункту назначения;
                """);

        // выбор функций
        try{
            int function = in.nextInt();
            if (function == 1){
                TrainNumSort(trains);
            }else {
                if (function == 2){
                    getTrain(trains);
                }else {
                    if (function == 3) {
                        TrainStationSort(trains);
                    }else {
                        System.out.print("Нет такой функции(Введите цифру из списка)!!!");
                        Start(trains);// запуск функции заново
                    }
                }
            }
        }catch (InputMismatchException er){
            // исключение неправильного ввода
            System.out.print("Нет такой функции(Введите цифру из списка)!!!");
            Start(trains);
        }

    }// запуск функций

    public static void main(String[] args) throws ParseException {

        Train[] trains = new Train[5];
        trains[0] = new Train("Минск",20433,"14:53");
        trains[1] = new Train("Брест",1255,"12:37");
        trains[2] = new Train("Москва",12388,"02:55");
        trains[3] = new Train("Варшава",4656,"10:30");
        trains[4] = new Train("Минск",3121,"08:00");

        Start(trains);

    }
}
