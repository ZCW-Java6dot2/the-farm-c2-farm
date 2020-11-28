package Farm;

import Person.Pilot;
import Vehicle.CropDuster;
import Vehicle.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    public List<Stable> getStableList() {
        return stableList;
    }

    public void setStableList(List<Stable> stableList) {
        this.stableList = stableList;
    }

    List<Stable> stableList = new ArrayList<>(3);
    List<ChickenCoop> chickenCoopList = new ArrayList<>();
    FarmHouse farmHouse;
    Field field;
    List<FarmVehicle> farmVehicleList = new ArrayList<>();
    CropDuster cropDuster = new CropDuster();
    Pilot froilanda = new Pilot();

}
