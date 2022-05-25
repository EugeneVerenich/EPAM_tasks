package com.company;

import java.util.Scanner;

public class Wheel {

    public enum Type{ Winter, Summer}

    private String brand;
    private double diameter;
    private Type type;

    public Wheel(String brand, double diameter, Type type){
        this.brand = brand;
        this.diameter = diameter;
        this.type = type;
    }

    public Wheel(){}

    public String toString(){
        String string = "";

        string += brand + "("+diameter+"): ";
        if (type == Type.Winter)
            string += "Winter";
        else
            string += "Summer";

        return string;
    }

    public static Wheel getWheel(){
        Scanner in = new Scanner(System.in);
        Wheel wheel = new Wheel();

        System.out.println("Введите бренд : ");
        wheel.brand = in.nextLine();

        System.out.println("Введите диаметр : ");
        wheel.diameter = in.nextDouble();

        System.out.print("Введи тип (1) - зимние, (2) - летние: ");
        while (true){
            int value = in.nextInt();
            if (value == 1){
                wheel.type = Type.Winter;
                break;
            }
            if (value == 2){
                wheel.type = Type.Summer;
                break;
            }
            System.out.print("Неправильное значение!!!");
        }
        return wheel;
    }

    public double getDiameter() {
        return diameter;
    }
}
