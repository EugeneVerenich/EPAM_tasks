package com.company;

import java.util.Scanner;

public class Engine {

    private int number;
    private double power;

    public Engine(int number, int power){
        this.number = number;
        this.power = power;
    }

    public Engine(){}

    public String toString(){
        return "Engine : " + number + ". Power : " + power;
    }

    public static Engine getEngine(){
        Scanner in = new Scanner(System.in);
        Engine engine = new Engine();

        System.out.print("Введите номер двигателя : ");
        engine.number = in.nextInt();

        System.out.print("Введите мощность двигателя : ");
        engine.power = in.nextDouble();

        return engine;
    }

}
