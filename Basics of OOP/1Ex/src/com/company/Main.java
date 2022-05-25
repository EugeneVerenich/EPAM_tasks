/*
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Directory directory = new Directory();
       File file = new File();
       TextFile textFile = new TextFile(file,directory);

       textFile.rename();
       textFile.add();
       textFile.showInfo();
       textFile.delete();
       textFile.showInfo();

    }
}
