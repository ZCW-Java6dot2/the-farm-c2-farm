package Farm;

import Animal.Chicken;
import Animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    public ChickenCoop() {
    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }

    public void setChickenList(List<Chicken> chickenList) {
        this.chickenList = chickenList;
    }

    List<Chicken> chickenList = new ArrayList<>();

    public void addChickens(Integer noOfChickens){
       Chicken chicken= new Chicken();

        for(int x = 0; x < noOfChickens; x++){
            chickenList.add(chicken);
        }
    }

    public void removeChickens(Integer noToRemove){

        if(noToRemove > this.chickenList.size() || noToRemove <= 0){
            // Cannot remove this chicken as not present.
        }else {
            for(int x = 0; x< noToRemove; x++){
                chickenList.remove(x);
            }
        }
    }
    public Integer getNumOfChickens(){
        return this.chickenList.size();
    }



}
