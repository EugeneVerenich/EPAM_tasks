/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int[] excellentArray = {9,9,10,9,10};
        int[] array = {8,9,8,8,9};
        int[] badArray = {6,7,6,8,8};

        Student[] students = new Student[10];
        students[0] = new Student( "Alexander","Gusaim",1,badArray);
        students[1] = new Student("Maria","Ivanova",2,excellentArray);
        students[2] = new Student("Sergey","Dmitrov",2,excellentArray);
        students[3] = new Student("Ilia","Tutov",3,excellentArray);
        students[4] = new Student("Daria","Tupik",1,badArray);
        students[5] = new Student("Alexey","Gusaim",1,badArray);
        students[6] = new Student("Maria","Ivanova",2,excellentArray);
        students[7] = new Student("Ivan","Ivanov",3,array);
        students[8] = new Student("Dmitriy","Don",3,array);
        students[9] = new Student("Pavel","Durov",3,excellentArray);
        for (int i = 0; i < students.length; i++) {
            students[i].showInfo();
        }

        for (int i = 0; i < students.length; i++) {
            students[i].excellentInfo();
        }

    }
}
