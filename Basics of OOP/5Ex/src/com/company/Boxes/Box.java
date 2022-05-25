package com.company.Boxes;

import com.company.Gift.Gifts;

import java.util.ArrayList;
import java.util.List;

public abstract class Box {

    private final List<Gifts> gifts = new ArrayList<>();

    public Box(Gifts gift){
        gifts.add(gift);
    }

    public Box(List<Gifts> giftsList){
        gifts.addAll(giftsList);
    }

    public abstract double getMaxWeight();
    public abstract double getCost();
    public abstract String getType();
    
    public void showInfo(){
        double weight = 0.0;
        double cost = 0.0;

        for (Gifts gift: gifts) {
            weight += gift.getWeight();
            cost += gift.getCost();
        }

        System.out.println("What's inside : ");
        for (Gifts gift: gifts) {
            System.out.print(gift.getName() + " ");
        }
        System.out.println();

        System.out.println("The total weight - " + weight);
        System.out.println("The total cost - " + cost);
        System.out.println("In total(plus cost of the box):" + getCost());

    }



}