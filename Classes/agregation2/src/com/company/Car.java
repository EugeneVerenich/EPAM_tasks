package com.company;

import java.util.Scanner;

public class Car {

    private Engine engine;
    private Wheel[] wheels;
    private String brand;
    private double consumption;
    private double fuel_level;

    public Car(Engine engine, Wheel[] wheels, String brand, double consumption, double fuel_level){
        this.engine = engine;
        this.wheels = wheels;
        this.brand = brand;
        this.consumption = consumption;
        this.fuel_level = fuel_level;
    }


    public String toString(){
        String string = "";

        string += brand +engine.toString() + "\n" +
                consumption +"L/100km {" + fuel_level+"}" +"\n"
                +"[";
        for (int i = 0; i < wheels.length; i++) {
            string += wheels[i].toString() + " ";
        }
        return string + "]";
    }

    public static Car getCar(){
        Scanner in = new Scanner(System.in);
        Car car = new Car(new Engine(0,0),new Wheel[4],"",0,0);

        System.out.print("Введите марку машины : ");
        car.brand = in.nextLine();

        System.out.print("Введите расход топлива на 100км : ");
        car.consumption = in.nextDouble();

        System.out.print("Введите текущий уровень топлива : ");
        car.fuel_level = in.nextDouble();

        System.out.print("Введите колеса : ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Колесо № " + i);
            car.wheels[i] = Wheel.getWheel();
        }

        car.engine = Engine.getEngine();

        return car;
    }

    public void move(){
        if (fuel_level <= 0){
            System.out.print("Машина не поедет, нет топлива!!!");
        }

        for (int i = 1; i < 4; i++) {
            if (wheels[i].getDiameter() != wheels[i-1].getDiameter())
                System.out.print("Машина не поедет, колеса разных размеров!!!");
        }

        double distance = fuel_level/consumption;
        System.out.println("Машина проехала : " + distance*100 + "км.");
        fuel_level = 0;
    }

    public void addFuel(double value){
        fuel_level += value;
    }

    public void changeWheel(){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите номер колеса [0-3] :");
        int number;
        while (true){
            number = in.nextInt();
            if (number >= 0 && number <= 3){
                break;
            }
            System.out.print("Неправильный номер!!!");
        }

        wheels[number] = Wheel.getWheel();
    }

}
