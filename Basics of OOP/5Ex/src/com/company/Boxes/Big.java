package com.company.Boxes;

import com.company.Gift.Gifts;

import java.util.List;

public class Big extends Box{

    private final String type = "Big";
    private final double maxWeight = 1.5;
    private final double cost = 3;

    public Big(List<Gifts> giftsList) {
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
