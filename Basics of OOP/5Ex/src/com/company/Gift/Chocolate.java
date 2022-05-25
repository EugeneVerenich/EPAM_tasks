package com.company.Gift;

public class Chocolate implements Gifts {

    private final double weight = 0.1;
    private final double cost = 1.99;
    private int count;

    public Chocolate(int count){
        this.count = count;
    }

    @Override
    public double getWeight() {
        return weight*count;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public double getCost() {
        return cost*count;
    }

    @Override
    public String getName() {
        return "Chocolate";
    }

    public String toString(){
        String name = "Chocolate";
        return "Sweets{"+ name +"}\n"+"Weight:"+weight+"\nCount:"+count+"\nCost:"+cost;
    }

}
