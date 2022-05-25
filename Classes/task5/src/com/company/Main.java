/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        Counter a = new Counter(5, 10, 6);
        Counter b = new Counter(6, 4, 7);
        Counter c = new Counter(5, 3);
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        for (int i = 0; i < 2; ++i) {
            //дважды операция инкремента
            a.increment();
            b.increment();
            c.increment();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");
        for (int i = 0; i < 20; ++i) {
            // 20 операций декремента
            a.decrement();
            b.decrement();
            c.decrement();
        }
        System.out.println("a: " + a.value());
        System.out.println("b: " + b.value());
        System.out.println("c: " + c.value());
        System.out.println("----------------------");

    }
}
