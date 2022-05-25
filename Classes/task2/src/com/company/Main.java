/*
Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        Test2 test21 = new Test2("Jony",35);
        test2.setFirst_name("Victor");
        test2.setAge(35);
    }
}
