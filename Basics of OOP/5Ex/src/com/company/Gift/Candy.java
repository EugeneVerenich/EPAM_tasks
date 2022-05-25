package com.company.Gift;

public class Candy implements Gifts {

    private final String name = "Candy";
    private final double weight = 0.043;
    private final double cost = 0.12;
    private int count;

    public Candy(int count){
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
        return name;
    }

    public String toString(){
        return "Sweets{"+getName()+"}\n"+"Weight:"+getWeight()+"\nCount:"+getCount()+"\nCost:"+getCost();
    }
}
