/**
 *  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        // координаты точек
        int[] X0 = {1,2,3,4};
        int[] X = {3,5,4,8};
        int[] Y0 = {2,8,3,6};
        int[] Y = {5,0,1,3};


        double max_distance = 0;
        int dot_num = 0;
        for (int i = 0; i < X.length; i++) {
            double distance = distance(X0[i], Y0[i], X[i], Y[i]);
            if(distance > max_distance){
                max_distance = distance;
                dot_num = i;
            }
        }

        System.out.println("Максимальная длина : "+ max_distance);
        System.out.println("Между точками ("+X0[dot_num]+","+Y0[dot_num]+") и ("+X[dot_num]+","+Y[dot_num]+")");

    }
    static double distance(int x0, int y0, int x, int y){
        double dist = Math.sqrt(Math.pow((x-x0),2)+Math.pow((y-y0),2));
        return dist;
    }
}
