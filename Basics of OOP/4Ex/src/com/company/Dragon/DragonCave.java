package com.company.Dragon;

import com.company.TreasurePack.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DragonCave {

    private Treasure treasure;
    private List<Treasure> treasures;

    public DragonCave(){
        treasures = new ArrayList<>();
        makeTreasure();
    }

    public void showTreasure(){
        treasures.forEach(System.out::println);
    }

    public void greatestTreasure(){
        int buf = 0;
        for (Treasure treas: treasures) {
            if (buf < treas.getCost()){
                buf = treas.getCost();
            }
        }
        for (Treasure treas: treasures) {
            if (buf == treas.getCost()){
                System.out.println(treas);
            }
        }
    }

    public void chooseAmountTreasure(int Sum){
        List<Treasure> treasuresList = new ArrayList<>();
        treasures.stream().sorted((x,y) -> y.getCost() - x.getCost());
        int buf = 0;
        for (Treasure tr : treasures){
            if (tr.getCost() <= Sum){
                Sum -= tr.getCost();
                treasuresList.add(tr);
                buf = Sum;
            }
            if (buf == 0){
                break;
            }
        }
        treasuresList.stream().forEach(System.out::println);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    private <T extends Enum<?>> T randomEnum(Class<T> tClass){
        Random random = new Random();
        int x = random.nextInt(tClass.getEnumConstants().length);
        return tClass.getEnumConstants()[x];
    }

    private void makeTreasure(){
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = "treasure description" + i;
            if (i % 2 == 0){
                treasures.add(new TreasureSilver(randomEnum(TreasureType.class),name, random.nextInt(1000)));
            }else if (i % 3 == 0){
                treasures.add(new TreasureGold(randomEnum(TreasureType.class),name, random.nextInt(1000)));
            }else {
                treasures.add(new TreasureDiamond(randomEnum(TreasureType.class),name, random.nextInt(1000)));
            }
        }
    }


}
