/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму
 */
package com.company;

import com.company.Dragon.Dragon;
import com.company.Dragon.DragonCave;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DragonCave dragon = new Dragon();
        int number = 0;
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("1 <-- Treasure list "+ "\n" +
                    "\"2 <-- Finding the most expensive treasure" +"\n" +
                    "\"3 <-- To find the treasure in a given amount"+"\n" +
                    "\"0 <-- EXIT\"");
            number = in.nextInt();
            switch (number) {
                case (1):
                    dragon.showTreasure();
                    break;
                case (2):
                    dragon.greatestTreasure();
                    break;
                case (3):
                    System.out.println("Enter sum :");
                    int sum = in.nextInt();
                    dragon.chooseAmountTreasure(sum);
                    break;
                default:
                    System.out.println("Invalid value!!!");
                    break;
            }
        }while (number != 0);

        dragon.greatestTreasure();

    }
}
