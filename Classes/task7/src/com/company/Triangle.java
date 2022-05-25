package com.company;

public class Triangle {

    // по длинам сторон
    private double a;
    private double b;
    private double c;
    // по точкам
    private Point point;
    private Point point1;
    private Point point2;

    // конструктор с заданными длинами
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

        boolean existence = false;

        if (a+b > c && c+b > a && a+c > b){
            existence = true;
        }else {
            System.out.println("Не существует такой теругольник!!!");
        }
    }

    // конструктор с заданными точками
    public Triangle(Point point,Point point1,Point point2){
        this.point = point;
        this.point1 = point1;
        this.point2 = point2;

        a = getLength(point,point1);
        b = getLength(point,point2);
        c = getLength(point1,point2);

        boolean existence = false;

        if (a+b > c && c+b > a && a+c > b){
            existence = true;
        }else {
            System.out.println("Не существует такой теругольник!!!");
        }

    }

    // находит длину между двумя точками
    public double getLength(Point point,Point point1){
        return Math.sqrt(Math.pow((point1.getX()- point.getX()),2)+Math.pow((point1.getX()- point.getX()),2));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // находит периметр
    public void getPerimeter(){
        double perimeter = a + b + c;
        System.out.println("Периметр треугольника : "+perimeter);
    }

    // находит площадь
    public void getSquare(){
        double half_p = (a + b + c)/2;
        double square = Math.sqrt(half_p*(half_p-a)*(half_p-b)*(half_p-c));
        System.out.println("Площадь треугольника : "+square);
    }

    // находит середину стороны(координату Х)
    public double getMiddleX(Point point,Point point1){
        return (point.getX()+ point1.getX())/2;
    }
    // находит середину стороны(координату Y)
    public double getMiddleY(Point point,Point point1){
        return (point.getY()+ point1.getY())/2;
    }
    // находит медиану по точкам
    public void getMedian(Point point,Point point1,Point point2){
        // ??????????????
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
