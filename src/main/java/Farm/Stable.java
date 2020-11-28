package Farm;

import Animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private List<Horse> horseList = new ArrayList<>();

    public List<Horse> getHorseList() {
        return horseList;
    }

    public void setHorseList(List<Horse> horseList) {
        this.horseList = horseList;
    }

    public void addHorses(Integer noOfHorses){
        Horse horse = new Horse();

        for(int x = 0; x < noOfHorses; x++){
            horseList.add(horse);
        }
    }

    public void removeHorses(Integer noToRemove){

        if(noToRemove > this.horseList.size() || noToRemove <= 0){
           // Cannot remove this horse as not present.
        }else {
            for(int x = 0; x< noToRemove; x++){
                horseList.remove(x);
            }
        }
    }
    public Integer getNumOfHorses(){
        return this.horseList.size();
    }

}
