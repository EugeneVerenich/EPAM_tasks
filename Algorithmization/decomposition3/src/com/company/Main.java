/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника.
 */
package com.company;

public class Main {

    public static void main(String[] args) {


        // Находим площадь шестиуголника
        int a = 6;
        double S = 6*treug(a);
        System.out.println("Площадь шестиугольника : "+S);

    }

    //Площадь теругольника
    static double treug(int a){
        return (Math.pow(a,2)*Math.sqrt(3))/4;
    }

}
