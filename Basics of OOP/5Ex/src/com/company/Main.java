/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
подарок). Составляющими целого подарка являются сладости и упаковка
 */
package com.company;

import com.company.Boxes.Big;
import com.company.Boxes.Box;
import com.company.Boxes.Middle;
import com.company.Boxes.Small;
import com.company.Gift.Candy;
import com.company.Gift.Chocolate;
import com.company.Gift.Gifts;
import com.company.Gift.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    private static Box box;
    private static List<Gifts> giftsList = new ArrayList<>();

    public static void main(String[] args) {

        giftChoosing("I want chocolate and toy and shfgj");
        box = boxChoosing(giftsList);

        box.showInfo();

    }

    public static void giftChoosing(String str){
        if (str.toLowerCase().contains("toy")){
            giftsList.add(new Toy(1));
        }
        if (str.toLowerCase().contains("chocolate")){
            giftsList.add(new Chocolate(3));
        }
        if (str.toLowerCase().contains("candy")){
            giftsList.add(new Candy(5));
        }
    }

    public static Box boxChoosing(List<Gifts>giftsList){
        double weight = 0;
        for (Gifts gifts: giftsList) {
            weight += gifts.getWeight();
        }

        if (weight <= 0.5){
            return new Small(giftsList);
        }else if (weight <= 1){
            return new Middle(giftsList);
        }else {
            return new Big(giftsList);
        }
    }

}
