package Farm;

import Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    List<Chicken> chickenList;

    public ChickenCoop(Integer numOfChicken) {
        this.chickenList = new ArrayList<>();
        for (int i = 0; i < numOfChicken; i++) {
            this.chickenList.add(new Chicken());
        }
    }
}
