package Farm;

import Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {

    private List<Chicken> chickenList;

    public ChickenCoop(Integer numOfChicken) {
        this.chickenList = new ArrayList<>();

        for (int i = 0; i < numOfChicken; i++) {
            this.chickenList.add(new Chicken());
        }
    }

    public void addChickens(Integer noOfChickens) {
        Chicken chicken = new Chicken();

        for (int x = 0; x < noOfChickens; x++) {
            chickenList.add(chicken);
        }
    }

    public void removeChickens(Integer noToRemove) {

        if (noToRemove > this.chickenList.size() || noToRemove <= 0) {
            // Cannot remove this chicken as not present.
        } else {
            for (int x = 0; x < noToRemove; x++) {
                chickenList.remove(x);
            }
        }
    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }

    public Integer getNumOfChickens() {
        return this.chickenList.size();
    }


}

