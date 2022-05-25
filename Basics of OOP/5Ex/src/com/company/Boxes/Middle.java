package com.company.Boxes;

import com.company.Gift.Gifts;

import java.util.List;

public class Middle extends Box{

    private final String type = "Middle";
    private final double maxWeight = 1;
    private final double cost = 2;

    public Middle(List<Gifts> giftsList) {
        super(giftsList);
    }

    @Override
    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getType() {
        return type;
    }
}
