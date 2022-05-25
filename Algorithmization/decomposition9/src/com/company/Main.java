/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int X = 10;
        int Y = 13;
        int Z = 20;
        int T = 5;

        // Проверка существования четырехугольника
        if (X < (Y+Z+T) && Y<(X+Z+T) && Z<(X+Y+T) && T<(X+Y+Z)){
            System.out.println("Четырехугольник существует!!!");
            System.out.println();
            rectangle(X, Y, Z, T);
        }else {System.out.println("Четырехугольник НЕ существует!!!");}

    }

    // Площадь прямоугольного треугольника
    static double triangle(int X, int Y){
        double t_angle = (X*Y)/2;
        return t_angle;
    }

    // Площадь разностороннего треугольника
    static double different(int X, int Y, int Z, int T){
        double hypotenuse = Math.sqrt(Math.pow(X,2)+Math.pow(Y,2)); // гипотенуза
        double half_p = (hypotenuse + Z + T) / 2; // полупериметр
        double d_angle = Math.sqrt(half_p * (half_p - hypotenuse) * (half_p - Z) * (half_p - T)); // Формула Герона
        return d_angle;
    }

    // Площадь четырехугольника
    static void rectangle(int X, int Y, int Z, int T){
        double r_angle = triangle(X, Y) + different(X, Y, Z, T);
        System.out.println("Площадь заданного четырехугольника : "+r_angle);
    }

}
