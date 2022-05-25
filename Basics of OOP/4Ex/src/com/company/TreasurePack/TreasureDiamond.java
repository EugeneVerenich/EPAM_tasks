package com.company.TreasurePack;

public class TreasureDiamond implements Treasure {

    private TreasureType treasureType;
    private String name;
    private int cost;

    public TreasureDiamond(TreasureType treasureType, String name, int cost){
        this.treasureType = treasureType;
        this.name = name;
        this.cost = cost*5;
    }

    @Override
    public TreasureType getTreasureType() {
        return treasureType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public String toString(){
        return "TreasureDiamond{" + treasureType + ", name : " + name + ", cost : " + cost;
    }
}
