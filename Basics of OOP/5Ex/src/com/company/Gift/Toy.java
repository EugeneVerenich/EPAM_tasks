package com.company.Gift;

public class Toy implements Gifts{

    private final double weight = 0.5;
    private final double cost = 3.5;
    private final String name = "Toy";
    private int count;

    public Toy(int count){
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
