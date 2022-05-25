/*
пункт назначения, номер рейса, тип самолета, время вылета, дни недели
 */
package com.company;

import java.util.Scanner;

public class Airline {
    private String destination;
    private String flight_number;
    private String airplane_type;
    private String departure_time;
    private String weekday;

    public Airline(String destination, String flight_number, String airplane_type, String departure_time, String weekday){
        this.destination = destination;
        this.flight_number = flight_number;
        this.airplane_type = airplane_type;
        this.departure_time = departure_time;
        this.weekday = weekday;
    }

    public Airline(){}

    public String toString(){
        return "Рейс : " + flight_number+"\n"
                + "Самолет : " + airplane_type+"\n"
                + "Пункт назначения : " + destination+"\n"
                + "Время вылета : " + departure_time+"\n"
                + "День недели : " + weekday+"\n";
    }

    // ввод данных для Airline
    public static Airline getAirline(){

        Scanner in = new Scanner(System.in);
        Airline airline = new Airline();

        System.out.print("Пункт назначения : ");
        airline.destination = in.nextLine();

        System.out.print("Номер рейса : ");
        airline.flight_number = in.nextLine();

        System.out.print("Самолет : ");
        airline.airplane_type = in.nextLine();

        System.out.print("Время отправления :");
        airline.departure_time = in.nextLine();

        System.out.print("День недели : ");
        airline.weekday = in.nextLine();

        return airline;
    }

    public void showInfo(){
        System.out.println(toString());
    }

    public String getAirplane_type() {
        return airplane_type;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setAirplane_type(String airplane_type) {
        this.airplane_type = airplane_type;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
