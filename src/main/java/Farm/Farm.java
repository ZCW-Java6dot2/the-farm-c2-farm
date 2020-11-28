package Farm;

import Person.Pilot;
import Vehicle.CropDuster;
import Interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Stable> stableList = new ArrayList<>();


    private List<ChickenCoop> chickenCoopList = new ArrayList<>();
    FarmHouse farmHouse;
    Field field;
    List<FarmVehicle> farmVehicleList = new ArrayList<>();
    CropDuster cropDuster = new CropDuster();
    Pilot froilanda = new Pilot();

    //Getter and Setter for stableList

    public List<Stable> getStableList() {
        return stableList;
    }
    public void setStableList(List<Stable> stableList) {
        this.stableList = stableList;
    }

    //Getter and Setter for CoopList
    public List<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }
    public void setChickenCoopList(List<ChickenCoop> chickenCoopList) {
        this.chickenCoopList = chickenCoopList;
    }



}
