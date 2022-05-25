package com.company.Boxes;

import com.company.Gift.Gifts;

import java.util.List;

public class Small extends Box{


    public Small(List<Gifts> giftsList) {
        super(giftsList);
    }

    @Override
    public double getMaxWeight() {
        return 0.5;
    }

    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getType() {
        return "Small";
    }
}
