package Farm;

import Person.Pilot;
import Vehicle.CropDuster;
import Interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Stable> stableList = new ArrayList<>();
    List<ChickenCoop> chickenCoopList = new ArrayList<>();
    FarmHouse farmHouse;
    Field field;
    List<FarmVehicle> farmVehicleList = new ArrayList<>();
    CropDuster cropDuster = new CropDuster();
    Pilot froilanda = new Pilot();
}
